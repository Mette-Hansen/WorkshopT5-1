package com.company;

import java.util.List;
import java.util.UUID;

public class Building {

    List<Sensor> sensors;
    List<Actuator> actuators;


    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    UUID addTemperatureSensor(String name){
        
    }
}
