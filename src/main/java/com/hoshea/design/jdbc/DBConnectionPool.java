package com.hoshea.design.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * 数据库连接池管理类
 */
public final class DBConnectionPool extends Pool {
    /**
     * 正在使用的连接数
     */
    private int checkedOut;

    /**
     * 存放产生的连接对象容器
     */
    private Vector<Connection> freeConnections = new Vector<>();

    /**
     * 密码
     */
    private String password = null;

    /**
     * 连接字符串
     */
    private String url = null;

    /**
     * 用户名
     */
    private String userName = null;

    /**
     * 空闲连接数
     */
    private static int num = 0;

    /**
     * 当前可用的连接数
     */
    private static int numActive = 0;

    /**
     * 连接池实例变量
     */
    private static DBConnectionPool pool = null;

    /**
     * 产生数据连接池
     *
     * @return
     */
    public static synchronized DBConnectionPool getInstance() throws IOException {
        if (pool == null) {
            pool = new DBConnectionPool();
        }
        return pool;
    }

    /**
     * 获得一个数据库连接池的实例
     */
    private DBConnectionPool() throws IOException {
        init();
        // 初始normal个连接
        for (int i = 0; i < normalConnect; i++) {
            Connection conn = newConnection();
            if (conn != null) {
                // 往容器中添加一个连接对象
                freeConnections.addElement(conn);
                // 记录总连接数
                num++;
            }
        }
    }

    /**
     * 初始化
     *
     * @throws IOException
     */
    private void init() throws IOException {
        InputStream is = DBConnectionPool.class.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(is);
        this.userName = properties.getProperty("db.username");
        this.password = properties.getProperty("db.password");
        this.driverName = properties.getProperty("db.driver");
        this.url = properties.getProperty("db.url");
        this.maxConnect = Integer.parseInt(properties.getProperty("db.maxConnect"));
        this.normalConnect = Integer.parseInt(properties.getProperty("db.normalConnect"));
    }

    /**
     * 如果不再使用某个连接对象，则可调此方法将该对象释放到连接池
     */
    @Override
    public synchronized void freeConnection(Connection conn) {
        freeConnections.addElement(conn);
        num++;
        checkedOut--;
        numActive--;
        //解锁
        notifyAll();
    }

    private Connection newConnection() {
        Connection conn = null;
        try {
            // 用户名为空
            if (userName == null) {
                conn = DriverManager.getConnection(this.url);
            } else {
                conn = DriverManager.getConnection(this.url,
                        this.userName, this.password);
            }
            System.out.println("连接池创建一个新的连接");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("无法创建这个URL的连接" + this.url);
            return null;
        }
        return conn;
    }

    /**
     * 获取一个可用连接（单例模式）
     *
     * @return
     */
    @Override
    public synchronized Connection getConnection() {
        Connection conn = null;
        //还有空闲的连接
        if (freeConnections.size() > 0) {
            num--;
            conn = freeConnections.firstElement();
            freeConnections.removeElement(0);
            try {
                if (conn.isClosed()) {
                    System.out.println("从连接池删除一个无效连接");
                    conn = getConnection();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println("从连接池删除一个无效连接");
                conn = getConnection();
            }
            //没有空闲连接且当前连接小于最大允许值，若最大值为0，则不限制
        } else if (maxConnect == 0 || checkedOut < maxConnect) {
            conn = newConnection();
        }
        if (conn != null) {
            checkedOut++;
        }
        numActive++;
        return conn;
    }

    /**
     * 获取一个连接，并加上等待时间限制，时间为毫秒
     *
     * @param timeout 设置该连接的持续时间（单位：毫秒）
     * @return
     */
    @Override
    public synchronized Connection getConnection(long timeout) {
        long startTime = System.currentTimeMillis();
        Connection conn;
        while ((conn = getConnection()) == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if ((System.currentTimeMillis() - startTime >= timeout)) {
                return null;
            }
        }
        return conn;
    }

    @Override
    public int getNum() {
        return DBConnectionPool.num;
    }

    @Override
    public int getNumActive() {
        return DBConnectionPool.numActive;
    }

    /**
     * 关闭所有连接
     */
    @Override
    protected synchronized void release() {
        try {
            // 将当前连接赋值到枚举中
            Enumeration<Connection> allConnections = freeConnections.elements();
            // 使用循环关闭连接池中的所有连接
            while (allConnections.hasMoreElements()) {
                // 如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素
                Connection conn = allConnections.nextElement();
                conn.close();
                num--;
            }
            freeConnections.removeAllElements();
            numActive = 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            super.release();
        }
    }

    @Override
    public void createPool() throws IOException {
        pool = new DBConnectionPool();
        if (pool != null) {
            System.out.println("创建连接池成功");
        } else {
            System.out.println("创建连接池失败");
        }
    }
}
