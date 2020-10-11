package com.hoshea.design.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        getList();
    }

    public static void save() throws SQLException {
        Student student = new Student();
        student.setId(3);
        student.setName("张山");
        student.setAge(25);

        StudentDao studentDao = new StudentDao();
        int lineNum = studentDao.save(student);
        System.out.println(lineNum);
    }

    public static void update() throws SQLException {
        Student student = new Student();
        student.setId(3);
        student.setName("张山");
        student.setAge(26);

        StudentDao studentDao = new StudentDao();
        int lineNum = studentDao.update(student);
        System.out.println(lineNum);
    }

    public static void getList() throws SQLException {
        StudentDao studentDao = new StudentDao();
        List<Student> list = studentDao.getList();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
