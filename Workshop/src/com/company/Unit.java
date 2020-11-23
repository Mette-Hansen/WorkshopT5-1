package com.company;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id;

    public Unit(String name,UUID id){
        this.name = name;
        this.id = id;
    }

    public UUID getId(){
        return this.id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
