package com.company;

import java.util.UUID;

public class Co2Sensor extends Sensor {

    public Co2Sensor(String name, UUID id, double value) {
        super(name, id, value);
    }

    @Override
    public String toString() {
        return "Co2Sensor{" +
                "value=" + getValue() +
                '}';
    }
}
