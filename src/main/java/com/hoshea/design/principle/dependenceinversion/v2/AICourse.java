package com.hoshea.design.principle.dependenceinversion.v2;

public class AICourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习Ai课程");
    }
}
