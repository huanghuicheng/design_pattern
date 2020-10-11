package com.hoshea.design.principle.dependenceinversion.v3;

public class Tom {
    /**
     * 依赖抽象，不依赖具体实现
     */
    private ICourse course;

    /**
     * 构造器注入
     * @param course 课程实例
     */
    public Tom(ICourse course) {
        this.course = course;
    }

    /**
     * set方法注入
     * @param course 课程实例
     */
    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        System.out.print("tom");
        course.study();
    }
}
