package com.company;

public class TemperatureSensor extends Sensor{
    private double value;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                '}';
    }
}
