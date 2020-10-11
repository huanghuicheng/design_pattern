package com.hoshea.design.principle.dependenceinversion.v2;

public class Main {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCource());
        tom.study(new PythonCourse());

        // 如果要再学Ai课程，加一个实现就行
        tom.study(new AICourse());
    }
}
