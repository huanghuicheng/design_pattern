package com.hoshea.design.pattern.creational.singleton.lazy.v4;

/**
 * 这种形式兼顾懒汉式单例写法的内存浪费问题和synchronized的性能问题
 */
public class LazyStaticInnerClassSingleton {
    //使用LazyStaticInnerClassSingleton的时候，默认会先初始化内部类
    //如果没有使用，则内部类是不加载的
    private LazyStaticInnerClassSingleton() {
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        //在返回结果之前，一定会先加载内部类
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
