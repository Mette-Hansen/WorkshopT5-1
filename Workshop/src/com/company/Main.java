package com.company;

import java.util.LinkedList;
import java.util.UUID;

public class    Main {

    public static void main(String[] args) {
    Building building = new Building(new LinkedList<Sensor>(), new LinkedList<Actuator>(), "Kantine", UUID.randomUUID());
        System.out.println(building.toString());
    }
}
