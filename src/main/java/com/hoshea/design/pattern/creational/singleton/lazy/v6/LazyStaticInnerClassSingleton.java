package com.hoshea.design.pattern.creational.singleton.lazy.v6;

/**
 * 在v4的基础上进行优化，防止反射破坏单例
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton() {
        if (LazyHolder.instance != null) {
            throw new RuntimeException("已经实例化，禁止再次实例话");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton instance = new LazyStaticInnerClassSingleton();
    }
}
