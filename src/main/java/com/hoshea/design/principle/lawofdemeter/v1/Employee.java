package com.hoshea.design.principle.lawofdemeter.v1;

import java.util.List;

public class Employee {
    public void checkNumberOfCourse(List<Course> courses) {
        System.out.println("当前已发布的课程数量是：" + courses);
    }
}
