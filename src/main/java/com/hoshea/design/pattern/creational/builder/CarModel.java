package com.hoshea.design.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    private List<String> sequence = new ArrayList<String>();

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public final void run() {
        for (String s : sequence) {
            if ("start".equalsIgnoreCase(s)) {
                this.start();
            } else if ("stop".equalsIgnoreCase(s)) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(s)) {
                this.alarm();
            } else if ("engineBoom".equalsIgnoreCase(s)) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
