package com.hoshea.design.pattern.structural.proxy.v1;

/**
 * 静态代理
 */
public class Main {
    public static void main(String[] args) {
        ISubject proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
