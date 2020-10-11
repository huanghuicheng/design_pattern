package com.hoshea.design.pattern.creational.abstractfactory.v1;

public class Main {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote();
        javaCourseFactory.createVideo();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote();
        pythonCourseFactory.createVideo();
    }
}
