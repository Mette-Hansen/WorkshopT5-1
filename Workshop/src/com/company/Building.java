package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit {

    private LinkedList<Actuator> actuators;
    private LinkedList<Sensor> sensors;


    public Building(List sensors, List actuators, String name, UUID id) {
        super(name, id);
        this.sensors = new LinkedList<Sensor>();
        this.actuators = new LinkedList<Actuator>();

    }

    public LinkedList<Sensor> getSensors() {
        return sensors;
    }

    public LinkedList<Actuator> getActuator() {
        return actuators;
    }

    public UUID addTemperatureSensor(String name,double value, UUID id) {
        UUID id2 = UUID.randomUUID();
        Sensor sensor = new TemperatureSensor(name, id,value);
        sensors.add(sensor);
        return id2;
    }
    public UUID addCo2Sensor(String name) {
        UUID id = UUID.randomUUID();
        Sensor sensor = new Co2Sensor(name, id, 0.5);
        sensors.add(sensor);
        return id;
    }
    public void removeSensor(UUID id) {
        sensors.remove();
    }
    public UUID addVentActuator(String name) {
        UUID id = UUID.randomUUID();
        Actuator actuator = new VentilationActuator(name, id, 10);
        actuators.add(actuator);
        return id;
    }
    public void removeActuator(UUID id){
        actuators.remove();
    }


}

