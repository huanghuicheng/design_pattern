package com.hoshea.design.principle.simpleresponsibility.v2;

public class ReplayCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("录播课程，可以反复观看");
    }
}
