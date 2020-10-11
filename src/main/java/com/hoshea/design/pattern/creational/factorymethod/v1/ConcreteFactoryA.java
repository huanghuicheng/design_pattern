package com.hoshea.design.pattern.creational.factorymethod.v1;

public class ConcreteFactoryA implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ConcreteProductA();
    }
}
