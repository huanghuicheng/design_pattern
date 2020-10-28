package com.hoshea.design.pattern.creational.prototype.v1;

public class ConcretePrototypeA implements IPrototype{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public IPrototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.description = this.description;
        return concretePrototypeA;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "description='" + description + '\'' +
                '}';
    }
}
