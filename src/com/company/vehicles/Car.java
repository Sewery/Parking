package com.company.vehicles;

public class Car  extends Automobil{
    private final int  personsInTheCar;


    public Car(String name, int personsInTheCar ) {
        super(name);
        this.personsInTheCar= personsInTheCar;
    }
    public String getDescription(){
        return "It is a "+super.getName()+" car with " + personsInTheCar + " persons.";
    }

    public int getPersonsInTheCar() {
        return personsInTheCar;
    }
}
