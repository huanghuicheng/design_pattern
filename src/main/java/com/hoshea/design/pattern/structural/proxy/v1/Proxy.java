package com.hoshea.design.pattern.structural.proxy.v1;

public class Proxy implements ISubject {
    private ISubject iSubject;

    public Proxy(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    public void before() {
        System.out.println("在执行真实方法之前的处理");
    }

    @Override
    public void request() {
        before();
        iSubject.request();
        after();
    }

    public void after() {
        System.out.println("在执行真实方法之后的处理");
    }
}
