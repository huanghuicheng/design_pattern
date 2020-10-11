package com.hoshea.design.pattern.creational.builder;

import java.util.List;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();


    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }

    @Override
    public void setSequence(List<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
