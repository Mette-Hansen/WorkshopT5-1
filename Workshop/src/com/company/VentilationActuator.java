package com.company;

public class VentilationActuator extends Actuator{
    //Attribute to String
    private String name;

    //Constructor matching super
    public VentilationActuator(String name, double value) {
        super(value);
        this.name = name;
    }

    @Override
    public double getValue(){
        return value;
    }

    @Override
    public String toString(){
        return name;
    }
}
