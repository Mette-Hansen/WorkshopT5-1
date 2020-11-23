package com.company;

import java.util.UUID;

public class TemperatureSensor extends Sensor{
    private double value;

    public TemperatureSensor(String name, UUID id, double value) {
        super(name, id, value);
    }

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
