package com.company;

import com.company.Managment.ParkingController;
import com.company.Managment.Parking;
import com.company.Managment.ParkingManagement;
import com.company.Managment.ParkingRegulationOfIncomes;
import com.company.vehicles.Automobil;
import com.company.vehicles.Car;
import com.company.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
            Parking parking = new Parking("Newcatle Parking",5,5);
            ParkingController parkingController = new ParkingController(parking);
            parking.createParking();
            System.out.println(parking.getParkingMap());
            Automobil ferrrai = new Car("Ferrrai",1);
            ParkingRegulationOfIncomes incomes = new ParkingRegulationOfIncomes(15.2,10,20.5);
            ParkingManagement   ops = new ParkingManagement(ferrrai,parkingController,incomes);
            ops.takeAParkingSpaceBySpecifiedCar();
            System.out.println(ops.getOrderedSpace());
            System.out.println(parking.getParkingMap());
            System.out.println(parking.getParkingMap());
            System.out.println(ops.getOrderedSpace());
            System.out.println(ops.getPriceForSpecifiedVehicle());
            System.out.println(parking.getIncome());
            System.out.println(parkingController.getFreeSpaces());




    }
}
