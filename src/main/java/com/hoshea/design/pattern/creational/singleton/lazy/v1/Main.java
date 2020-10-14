package com.hoshea.design.pattern.creational.singleton.lazy.v1;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
    }
}
