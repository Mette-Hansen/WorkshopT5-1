package com.company;

import java.util.UUID;

public class VentilationActuator extends Actuator {
    //Attribute to String
    private String name;

    //Constructor matching super
    public VentilationActuator(String name, UUID id, double value) {
        super(name, id, value);
        this.name = name;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}
