package com.hoshea.design.principle.simpleresponsibility.v1;

public class Course {
    public void study(String courseType) {
        if ("直播课".equals(courseType)) {
            System.out.println("直播课不可以快进");
        } else if ("录播课".equals(courseType)) {
            System.out.println("录播课可以反复观看，快进快退");
        }
    }
}
