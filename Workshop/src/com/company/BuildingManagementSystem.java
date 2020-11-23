package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {

    private List<Building> buildings;

    public List<Building> getBuilding() {
        return buildings;
    }

    public UUID addBuilding(String name) {
        UUID id = UUID.randomUUID();
        Building building = new Building(new LinkedList<Sensor>(), new LinkedList<Actuator>(), name, id);
        buildings.add(building);
        return id;
    }

    public void removeBuilding(UUID id) {
        buildings.remove(id);
    }


}
