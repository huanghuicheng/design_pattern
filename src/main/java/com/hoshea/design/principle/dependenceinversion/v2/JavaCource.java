package com.hoshea.design.principle.dependenceinversion.v2;

public class JavaCource implements ICourse {
    @Override
    public void study() {
        System.out.println("学习java课程");
    }
}
