package com.hoshea.design.principle.lawofdemeter.v1;

public class Main {
    public static void main(String[] args) {
        TeamLeader leader = new TeamLeader();
        Employee employee = new Employee();
        leader.commandCheckNumber(employee);
    }
}
