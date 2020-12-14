package com.company.Managment;

public class ParkingRegulationOfIncomes {
    //Chcemy by parking od samochodu pobieral pieniadze -
    // -zaleznie czy jest samochodem itd
    //-dodawal je do "skarbca"
    //-pobiera pieniadze podczas zabierania miejsca przez parkingmanagment
    private double priceForHourCar;
    private double priceForHourMotorcycle;
    private double priceForHourTruck;


    public ParkingRegulationOfIncomes(double priceForHourCar, double priceForHourMotorcycle, double priceForHourTruck) {
        this.priceForHourCar = priceForHourCar;
        this.priceForHourMotorcycle = priceForHourMotorcycle;
        this.priceForHourTruck = priceForHourTruck;
    }

    public double getPriceForHourCar() {
        return priceForHourCar;
    }

    public void setPriceForHourCar(double priceForHourCar) {
        this.priceForHourCar = priceForHourCar;
    }

    public double getPriceForHourMotorcycle() {
        return priceForHourMotorcycle;
    }

    public void setPriceForHourMotorcycle(double priceForHourMotorcycle) {
        this.priceForHourMotorcycle = priceForHourMotorcycle;
    }

    public double getPriceForHourTruck() {
        return priceForHourTruck;
    }

    public void setPriceForHourTruck(double priceForHourTruck) {
        this.priceForHourTruck = priceForHourTruck;
    }
}
