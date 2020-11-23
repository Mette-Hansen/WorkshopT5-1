package com.company;

import java.util.UUID;

public abstract class Sensor extends Unit{
    private double value;

    public Sensor(String name, UUID id,double value) {
        super(name, id);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
