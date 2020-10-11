package com.hoshea.design.pattern.creational.factorymethod.v1;

public class ConcreteFactoryC implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ConcreteProductC();
    }
}
