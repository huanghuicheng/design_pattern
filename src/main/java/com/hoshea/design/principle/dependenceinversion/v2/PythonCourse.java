package com.hoshea.design.principle.dependenceinversion.v2;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习python课程");
    }
}
