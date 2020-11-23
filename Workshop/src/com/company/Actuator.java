package com.company;

public abstract class Actuator extends Unit {
    //Attribute
    private double value;

    public Actuator(double value) {
        super();

    }


    //Methods


    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

