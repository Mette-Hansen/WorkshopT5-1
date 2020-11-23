package com.company;

<<<<<<< Updated upstream
=======
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit {

    private LinkedList<Integer> actuator = new LinkedList<Integer>();
    private LinkedList<Integer> sensor = new LinkedList<Integer>();


    public Building(List sensor, List actuator) {

    }

    public LinkedList getSensors() {
        return sensor;
    }

    public LinkedList getActuator() {
        return actuator;
    }

    public UUID addTemperatureSensor(String name) {
        sensor.add(value);
        return
    }

}
>>>>>>> Stashed changes
