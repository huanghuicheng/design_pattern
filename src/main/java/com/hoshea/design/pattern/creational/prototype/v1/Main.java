package com.hoshea.design.pattern.creational.prototype.v1;

public class Main {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setDescription("concretePrototypeA");

        ConcretePrototypeA clone = (ConcretePrototypeA) concretePrototypeA.clone();
        clone.setDescription("clone");
        System.out.println(concretePrototypeA.toString());
        System.out.println(clone.toString());

    }
}
