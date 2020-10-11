package com.hoshea.design.pattern.creational.simplefactory.v1;

public class CourseFactory {
    public static ICourse createCourse(Class<? extends ICourse> clazz) {
        ICourse course = null;
        try {
            course = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return course;
    }
}
