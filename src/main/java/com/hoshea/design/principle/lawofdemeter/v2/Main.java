package com.hoshea.design.principle.lawofdemeter.v2;

public class Main {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.commandCheckNumber(new Employee());
    }
}
