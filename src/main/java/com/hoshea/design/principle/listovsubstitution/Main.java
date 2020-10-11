package com.hoshea.design.principle.listovsubstitution;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        invoker();
        invoker1();
        invoker2();
    }

    public static void invoker() {
        // 父类存在的地方字类就应该能够存在
        Father father = new Father();
        HashMap hashMap = new HashMap();
        father.doSomething(hashMap);
    }

    public static void invoker1() {
        // 父类存在的地方字类就应该能够存在
        Father son = new Son();
        HashMap hashMap = new HashMap();
        son.doSomething(hashMap);
    }

    public static void invoker2() {
        // 父类存在的地方字类就应该能够存在
        Son son = new Son();
        Map map = new HashMap();
        son.doSomething(map);
    }
}
