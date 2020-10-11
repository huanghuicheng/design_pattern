package com.hoshea.design.pattern.creational.builder;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();


    @Override
    public CarModel getCarModel() {
        return this.benz;
    }

    @Override
    public void setSequence(List<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
