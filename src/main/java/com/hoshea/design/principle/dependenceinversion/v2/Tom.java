package com.hoshea.design.principle.dependenceinversion.v2;

public class Tom {
    //依赖抽象，不依赖具体实现
    public void study(ICourse course) {
        System.out.print("tom");
        course.study();
    }
}
