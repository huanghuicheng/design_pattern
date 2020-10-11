package com.hoshea.design.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {
    private static Properties properties;

    private JdbcUtils() {
    }

    static {
        //加载驱动类并注册
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            InputStream is = contextClassLoader.getResourceAsStream("db.properties");
            properties = new Properties();
            properties.load(is);
            Class.forName(properties.getProperty("db.driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return getConnection(properties.getProperty("db.url"),
                properties.getProperty("db.username"),
                properties.getProperty("db.password"));
    }

    /**
     * 获取连接对象
     *
     * @param url      数据库地址
     * @param userName 用户名
     * @param password 密码
     * @return 数据库连接
     */
    public static Connection getConnection(String url, String userName, String password) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static void close(ResultSet set, Statement st, Connection connection) {
        try {
            if (set != null) {
                set.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
