package com.hoshea.design.principle.lawofdemeter.v1;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void commandCheckNumber(Employee employee) {
        List<Course> courses = new ArrayList<Course>(16);
        for (int i = 0; i < 16; i++) {
            courses.add(new Course());
        }
        employee.checkNumberOfCourse(courses);
    }
}
