package com.company;

import java.util.UUID;

public class Sensor extends Unit{
    private double value;

    public Sensor(String name, UUID id,double value) {
        super(name, id);
        this.setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
