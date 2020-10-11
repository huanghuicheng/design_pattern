package com.hoshea.design.principle.lawofdemeter.v2;

public class TeamLeader {
    public void commandCheckNumber(Employee employee) {
        employee.checkNumberOfCourse();
    }
}
