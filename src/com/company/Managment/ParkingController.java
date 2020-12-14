package com.company.Managment;

import com.company.vehicles.Automobil;
import com.company.vehicles.Vehicle;

import java.util.*;

public class ParkingController {
    private Parking parking;


    public ParkingController(Parking parking){

        this.parking = parking;
        parking.createParking();
    }


    public String takeAParkSpace(){
        HashMap<Character, ArrayList<String>> parkingMap = parking.getParkingMap();

        class RandomKeyAndValue{
            public char randomChar;
            public int randomSpaceInArrayList;

           private HashMap<Character, ArrayList<String>> ok;

           RandomKeyAndValue(HashMap<Character, ArrayList<String>> ah) {
               this.ok = ah;
           }
           public void takeARandomPlace(){
               Random random = new Random();
                ArrayList<Character> k= new ArrayList<>(ok.keySet());
                randomChar =k.get(random.nextInt(ok.size()-1));
                ok.compute(randomChar,(key, val)-> {
                    Random randome = new Random();
                    if(val.size()>= 1) {
                        randomSpaceInArrayList = randome.nextInt(val.size() - 1);
                        if(val.get(randomSpaceInArrayList).equals("TAKEN")){
                            this.takeARandomPlace();
                        }else if(!val.contains("empty")){
                            System.out.println("BRAK MIEJSC NA PARKINGU");
                        }
                        val.set(randomSpaceInArrayList ,"TAKEN");
                    }
                    return val;
                });
           }


       }

        var ha = new RandomKeyAndValue(parkingMap);
        ha.takeARandomPlace();
        return  Character.toString(ha.randomChar) + ha.randomSpaceInArrayList;
    }
    public void deleteAParkSpace(String giveTakenSpace){
        char letter = giveTakenSpace.charAt(0);

        int intr = Integer.parseInt(giveTakenSpace.replaceAll("\\D",""));
        HashMap<Character, ArrayList<String>> parkingMap = parking.getParkingMap();

        parkingMap.compute(letter,(key,val)->{
            val.set(intr,"empty");
            return val;
        });



    }
    public void addMoneyToBudget(double d){
        parking.increaseIncome(d);
    }
    public String getFreeSpaces(){
        int w=0;
        HashMap<Character, ArrayList<String>> parkingMap = parking.getParkingMap();
        Iterator keySetIterator =parkingMap.keySet().iterator();

        while (keySetIterator.hasNext())
        {
            char key = (char) keySetIterator.next();
            w+=parkingMap.get(key).stream().filter(v->!v.equals("TAKEN")).count();
        }
        return "Free spaces are already : " + w;

    }



}
