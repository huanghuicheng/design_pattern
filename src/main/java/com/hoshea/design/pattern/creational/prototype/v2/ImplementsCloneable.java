package com.hoshea.design.pattern.creational.prototype.v2;

/**
 * Cloneable是个标识接口，目的是告诉jvm，当前对象可以克隆。
 * 如果不实现Cloneable接口直接调用clone方法，抛出CloneNotSupportedException
 */
public class ImplementsCloneable implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        ImplementsCloneable implementsCloneable = new ImplementsCloneable();
        Object clone = implementsCloneable.clone();
    }
}
