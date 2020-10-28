package com.hoshea.design.pattern.structural.proxy.v2_1;

public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("真实对象");
    }
}
