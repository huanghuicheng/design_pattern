package com.hoshea.design.principle.simpleresponsibility.v2;

public class Main {
    public static void main(String[] args) {
        ICourse liveCourse = new LiveCourse();
        liveCourse.study();
        ICourse replayCourse = new ReplayCourse();
        replayCourse.study();
    }
}