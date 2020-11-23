package com.company;

public abstract class Actuator extends Unit {
    //Attribute
    double value;

    //Constructor
    public Actuator(double value){
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

