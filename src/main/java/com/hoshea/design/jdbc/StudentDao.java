package com.hoshea.design.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public int save(Student student) throws SQLException {
        String sql = "insert into t_student(id, name, age) values(?, ?, ?)";
        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            //加载注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/sili?useUnicode=yes&characterEncoding=UTF-8",
                    "root",
                    "root");
            //创建语句对象
            ps = conn.prepareStatement(sql);
            ps.setObject(1,student.getId());
            ps.setObject(2, student.getName());
            ps.setObject(3, student.getAge());
            //执行sql
            result = ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            conn.close();
            ps.close();
        }
        return result;
    }

    public int update(Student student) throws SQLException {
        String sql = "update t_student set name = ?, age = ? where id = ?";
        Connection connection = JdbcUtils.getConnection("jdbc:mysql:///sili?useUnicode=yes&characterEncoding=UTF-8",
                "root",
                "root");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, student.getName());
        preparedStatement.setObject(2, student.getAge());
        preparedStatement.setObject(3, student.getId());
        int result = preparedStatement.executeUpdate();
        JdbcUtils.close(null, preparedStatement, connection);
        return result;
    }

    public List<Student> getList() throws SQLException {
        String sql = "select id, name, age from t_student";
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Student> students = new ArrayList<Student>();
        while (resultSet.next()) {
            Student student = new Student();
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            students.add(student);
        }
        return students;
    }
}
