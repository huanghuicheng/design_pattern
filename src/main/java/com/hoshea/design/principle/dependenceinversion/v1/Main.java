package com.hoshea.design.principle.dependenceinversion.v1;

public class Main {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studyJavaCourse();
        tom.studyPythonCourse();

        // 如果Tom再学习其他，需要修改高层模块Main，同时也要修改底层模块Tom.违背了openclose原则
    }
}
