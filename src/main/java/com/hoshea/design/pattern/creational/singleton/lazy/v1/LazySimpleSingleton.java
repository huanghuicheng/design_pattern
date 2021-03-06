package com.hoshea.design.pattern.creational.singleton.lazy.v1;

// 懒汉式在使用的时候初始化
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
