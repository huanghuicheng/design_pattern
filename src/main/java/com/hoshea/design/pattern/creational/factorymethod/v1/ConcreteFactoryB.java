package com.hoshea.design.pattern.creational.factorymethod.v1;

public class ConcreteFactoryB implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ConcreteProductB();
    }
}
