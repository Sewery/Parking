package com.company.Managment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Parking {
    private  final String name;
    private  final int numberOfKeys;
    private  final int numberOfValues;
    private  HashMap<Character, ArrayList<String>> parkingMap ;
    private double income = 100;

    public Parking(String name, int numberOfRows, int numberOfColumns) {
        this.name = name;
        this.numberOfKeys = numberOfRows;
        this.numberOfValues = numberOfColumns;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfParkingSpaces() {

        return numberOfValues * numberOfValues;
    }
    public void createParking()
    {
        int w= 65;
        parkingMap = new HashMap<>();
        for (int i = 0; i < this.getNumberOfKeys(); i++) {
            List<String> ok = new ArrayList<>(Arrays.asList(new String[this.getNumberOfValues()]));
            ArrayList<String> oa = ok.stream().map(e->"empty").collect(Collectors.toCollection(ArrayList::new));
            parkingMap.put((char)w,oa);
            w++;
        }


    }
    public HashMap<Character, ArrayList<String>> getParkingMap(){
        return parkingMap;
    }

    public void increaseIncome(double d) {
        income += d;
    }

    public double getIncome() {
        return income;
    }
}
