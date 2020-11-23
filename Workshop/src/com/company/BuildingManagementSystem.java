package com.company;

import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {

    private List<Building> building;

    public List<Building> getBuilding() {
        return building;
    }

    public UUID addBuilding(String name){
        if (!building.contains(name){
            building.add(name);
        }
    }

    public void removeBuilding(UUID id){
        building.remove(id);
    }


}
