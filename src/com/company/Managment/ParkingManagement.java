package com.company.Managment;

import com.company.vehicles.Automobil;
import com.company.vehicles.Car;
import com.company.vehicles.Motorcycle;
import com.company.vehicles.Vehicle;

public class ParkingManagement {
    private Automobil ok;
    private ParkingController parkingController;
    private String orderedSpace = "none";
    private ParkingRegulationOfIncomes parkingRegulationOfIncomes;
    public ParkingManagement(Automobil automobil, ParkingController parkingController, ParkingRegulationOfIncomes parkingRegulationOfIncomes) {
        this.ok = automobil;
        this.parkingController = parkingController;
        this.parkingRegulationOfIncomes = parkingRegulationOfIncomes;
    }
    //Chcemy by ta klasa pokazywala zajete miejsce przez dany pojazd
    public void takeAParkingSpaceBySpecifiedCar(){
        this.orderedSpace= parkingController.takeAParkSpace();
        parkingController.addMoneyToBudget(this.getPriceForSpecifiedVehicle());
    }

    public String getOrderedSpace() {
        return orderedSpace;
    }
    public String goOutfromOrderedSpace() {
        String k = this.getOrderedSpace();
        parkingController.deleteAParkSpace(this.getOrderedSpace());
        orderedSpace="none";
        return "Vehcle "+ ok.getName()+" from " + k + " has left";
    }
    public double getPriceForSpecifiedVehicle(){
            if(ok instanceof Car){
                return parkingRegulationOfIncomes.getPriceForHourCar();
            }
        return ok instanceof Motorcycle ? parkingRegulationOfIncomes.getPriceForHourMotorcycle(): parkingRegulationOfIncomes.getPriceForHourTruck();
    }

}
