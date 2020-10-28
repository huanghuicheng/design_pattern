package com.hoshea.design.pattern.structural.proxy.v2_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 婚介所
 */
public class HunJieSuo implements InvocationHandler {
    private IPersion persion;

    public IPersion getIntance(IPersion persion) {
        this.persion = persion;
        return (IPersion)Proxy.newProxyInstance(
                IPersion.class.getClassLoader(),
                new Class[]{IPersion.class},
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
//        HunJieSuo hunJieSuo = (HunJieSuo) proxy;
        before();
        Object result = method.invoke(persion, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("婚介所开始物色对象，介绍需要结婚的人");
    }

    public void after() {
        System.out.println("两人开始交往");
    }
}
