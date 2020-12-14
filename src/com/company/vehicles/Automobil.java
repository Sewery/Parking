package com.company.vehicles;

public abstract class Automobil  {
    private String name;

    public Automobil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String getDescription();

}
