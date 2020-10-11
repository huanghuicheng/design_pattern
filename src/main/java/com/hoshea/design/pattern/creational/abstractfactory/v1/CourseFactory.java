package com.hoshea.design.pattern.creational.abstractfactory.v1;

/**
 * 用于实例化产品族
 */
public abstract class CourseFactory {
    public void init() {
        System.out.println("做一些初始话的操作");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
