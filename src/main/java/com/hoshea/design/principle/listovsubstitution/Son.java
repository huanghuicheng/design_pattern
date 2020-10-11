package com.hoshea.design.principle.listovsubstitution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {

    public Collection doSomething(HashMap hashMap) {
        System.out.println("字类被执行...");
        return hashMap.values();
    }
}
