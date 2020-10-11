package com.hoshea.design.pattern.creational.simplefactory.v1;

public class Main {
    public static void main(String[] args) {
        ICourse javaCourse = CourseFactory.createCourse(JavaCourse.class);
        ICourse pythonCourse = CourseFactory.createCourse(PythonCourse.class);
        javaCourse.record();
        pythonCourse.record();
    }
}
