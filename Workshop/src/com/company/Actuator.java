package com.company;

import java.util.UUID;

public abstract class Actuator extends Unit {
    //Attribute
    double value;

    public Actuator(String name, UUID id, double value) {
        super(name,id);
        this.value=value;

    }


    //Methods


    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

