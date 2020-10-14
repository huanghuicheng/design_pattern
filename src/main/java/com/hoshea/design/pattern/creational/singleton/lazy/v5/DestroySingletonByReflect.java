package com.hoshea.design.pattern.creational.singleton.lazy.v5;

import com.hoshea.design.pattern.creational.singleton.lazy.v4.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射破坏单例
 */
public class DestroySingletonByReflect {
    public static void main(String[] args) {
        try {
            Class<LazyStaticInnerClassSingleton> clazz = LazyStaticInnerClassSingleton.class;
            Constructor<LazyStaticInnerClassSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazyStaticInnerClassSingleton instance1 = constructor.newInstance();
            LazyStaticInnerClassSingleton instance2 = constructor.newInstance();
            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
