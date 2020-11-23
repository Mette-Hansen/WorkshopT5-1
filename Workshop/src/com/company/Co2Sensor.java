package com.company;

public class Co2Sensor extends Sensor {
    private double value;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Co2Sensor{" +
                "value=" + value +
                '}';
    }
}
