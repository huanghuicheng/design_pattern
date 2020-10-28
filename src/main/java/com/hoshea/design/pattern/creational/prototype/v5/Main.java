package com.hoshea.design.pattern.creational.prototype.v5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = ConcretePrototype.getInstance();
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(concretePrototype == clone);
    }
}
