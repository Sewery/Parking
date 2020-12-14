package com.company.vehicles;

public class Motorcycle extends Automobil{
    private final String howManyWheels;


    public Motorcycle(String name, String howManyWheels) {
        super(name);
        this.howManyWheels = howManyWheels;
    }

    public String getHowManyWheels() {
        return howManyWheels;
    }
    public String getDescription(){
        return "It is a " + this.getHowManyWheels()+"  very nice " + super.getName();
    }

}
