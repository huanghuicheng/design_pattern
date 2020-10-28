package com.hoshea.design.pattern.creational.prototype.v1;

public class ConcretePrototypeB implements IPrototype {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public IPrototype clone() {
        ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB();
        concretePrototypeB.description = this.description;
        return concretePrototypeB;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "description='" + description + '\'' +
                '}';
    }
}
