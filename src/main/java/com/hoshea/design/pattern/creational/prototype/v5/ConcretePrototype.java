package com.hoshea.design.pattern.creational.prototype.v5;

public class ConcretePrototype implements Cloneable{
    private static ConcretePrototype concretePrototype = new ConcretePrototype();

    private ConcretePrototype() { }

    public static ConcretePrototype getInstance() {
        return concretePrototype;
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }
}
