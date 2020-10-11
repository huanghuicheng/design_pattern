package com.hoshea.design.pattern.creational.abstractfactory.v1;

/**
 * 生产java课程产品族
 */
public class JavaCourseFactory extends CourseFactory {

    @Override
    protected INote createNote() {
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        return new JavaVideo();
    }
}
