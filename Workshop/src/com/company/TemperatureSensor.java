package com.company;

import java.util.UUID;

public class TemperatureSensor extends Sensor {


    public TemperatureSensor(String name, UUID id, double value) {
        super(name, id, value);
    }


    //public void setTemperatureSensor(double value) { this.value=value;}




    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + getValue() +
                '}';
    }
}
