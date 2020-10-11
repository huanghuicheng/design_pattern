package com.hoshea.design.pattern.creational.abstractfactory.v1;

/**
 * 生产python课程产品族
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        return new PythonVedio();
    }
}
