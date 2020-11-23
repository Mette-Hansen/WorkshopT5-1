package com.company;

import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {

    List<Building> buildings;

    public List<Building> getBuildings() {

        return buildings;
    }

    public UUID addBuilding(String name){
        if (!buildings.contains(name)){
            buildings.add(name);
        }
    }

    public void removeBuilding(UUID id){
        buildings.remove(id);
    }


}
