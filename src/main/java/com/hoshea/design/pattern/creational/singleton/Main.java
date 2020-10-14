package com.hoshea.design.pattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        CommonSingleton instance1 = CommonSingleton.getInstance();
        CommonSingleton instance2 = CommonSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        HungryStaticSingleton.getInstance();
    }
}
