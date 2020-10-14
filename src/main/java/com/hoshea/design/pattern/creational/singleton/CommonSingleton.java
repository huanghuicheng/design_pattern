package com.hoshea.design.pattern.creational.singleton;

public class CommonSingleton {
    private static final CommonSingleton SINGLETON = new CommonSingleton();

    private CommonSingleton() {}

    public static CommonSingleton getInstance() {
        return CommonSingleton.SINGLETON;
    }
}
