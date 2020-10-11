package com.hoshea.design.principle.simpleresponsibility.v2;

public class LiveCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("直播课不能快进");
    }
}
