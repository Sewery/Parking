package com.company.vehicles;

public class Truck extends Automobil{
    private  final double weightInTones;

    public Truck(String name, double weightInTones) {
        super(name);
        this.weightInTones = weightInTones;
    }
    @Override
    public String getDescription() {
        return "It is a "+ super.getName()+". Truck's weight is a "+ this.getWeightInTones();
    }

    public double getWeightInTones() {
        return weightInTones;
    }
}

