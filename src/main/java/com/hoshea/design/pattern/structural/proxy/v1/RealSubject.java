package com.hoshea.design.pattern.structural.proxy.v1;

public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("RealSubject do something");
    }
}
