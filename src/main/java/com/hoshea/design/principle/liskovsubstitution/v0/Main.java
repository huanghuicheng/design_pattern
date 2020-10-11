package com.hoshea.design.principle.liskovsubstitution.v0;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        superClass.playGame();
    }
}
