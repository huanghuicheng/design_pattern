package com.hoshea.design.pattern.creational.singleton.lazy.v6;

import com.hoshea.design.pattern.creational.singleton.lazy.ThreadLocalSingleton;

public class Main {
    public static void main(String[] args) {
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance3 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance4 = ThreadLocalSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
            }
        });
        thread1.start();
        thread2.start();
    }
}
