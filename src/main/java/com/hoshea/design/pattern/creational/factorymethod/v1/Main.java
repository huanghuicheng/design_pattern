package com.hoshea.design.pattern.creational.factorymethod.v1;

public class Main {
    public static void main(String[] args) {
        IFactory factoryA = new ConcreteFactoryA();
        IProduct productA = factoryA.makeProduct();
        productA.doSomething();
    }
}

