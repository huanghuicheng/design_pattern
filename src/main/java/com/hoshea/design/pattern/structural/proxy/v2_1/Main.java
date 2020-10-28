package com.hoshea.design.pattern.structural.proxy.v2_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 在运行期创建接口的实例
 */
public class Main {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());
                return null;
            }
        };

        ISubject subject = (ISubject) Proxy.newProxyInstance(
                ISubject.class.getClassLoader(),
                new Class[]{ISubject.class},
                handler);
        subject.request();
    }
}
