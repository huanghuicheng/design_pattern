package com.hoshea.design.pattern.creational.singleton.lazy;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }
}
