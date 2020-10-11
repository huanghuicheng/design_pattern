package com.hoshea.design.principle.lawofdemeter.v2;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    public void checkNumberOfCourse() {
        List<Course> courses = new ArrayList<Course>(16);
        for (int i = 0; i < 16; i++) {
            courses.add(new Course());
        }
        System.out.println("当前已发布的课程数量是：" + courses.size());
    }
}
