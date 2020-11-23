package com.company;

import java.util.LinkedList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Building building = new Building(new LinkedList<Sensor>(), new LinkedList<Actuator>(), "Building1", UUID.randomUUID());
        building.addCo2Sensor("Sensor1");
        building.addTemperatureSensor("TempSen1",22,UUID.randomUUID());

        building.addVentActuator("Vent1");
        System.out.println("Buildings name: " + building.getName());
        System.out.println("Building Id: "+ building.getId());
        System.out.println("Building Sensor: " + building.getSensors());
        System.out.println("Building Vent: " + building.getActuator());
    }
}
