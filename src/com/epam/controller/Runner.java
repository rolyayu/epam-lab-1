package com.epam.controller;

import com.epam.entities.*;

public class Runner {
    public static void main(String[] args) {
        PassengerCar[] cars = new PassengerCar[4];

        RoadsterCar roadster = new RoadsterCar(15000,3);
        roadster.setFuelRate(10);
        roadster.setMark("Mazda");
        roadster.setFuelType(FuelType.PETROL);
        roadster.setTotalMileage(150000);
        roadster.setTwoPlusTwo(true);
        roadster.setMaxSpeed(180);
        cars[0] = roadster;

        TargaCar targa = new TargaCar(15000,1);
        targa.setFuelRate(7);
        targa.setMark("Mitsubishi");
        targa.setFuelType(FuelType.GAS);
        targa.setTotalMileage(14000);
        targa.setTwoPlusTwo(true);
        targa.setMaxSpeed(160);
        targa.setRemovableRoof(true);
        cars[1] = targa;

        SedanCar sedan = new SedanCar(20000,4);
        sedan.setFuelRate(11);
        sedan.setMark("BMW");
        sedan.setFuelType(FuelType.DIESEL);
        sedan.setTotalMileage(30000);
        sedan.setMaxSpeed(120);
        cars[2] = sedan;

        UniversalCar universal = new UniversalCar(7000,2);
        universal.setFuelRate(9);
        universal.setMark("Peugeot");
        universal.setFuelType(FuelType.DIESEL);
        universal.setTotalMileage(60000);
        universal.setMaxSpeed(120);
        cars[3] = universal;

        TaxiPark park = new TaxiPark();
        park.setCars(cars);
        System.out.println(park);

        System.out.println("Start of sorting by fuel rate");
        park.sort();
        System.out.println(park);
        System.out.println("End of sorting by fuel rate");

        int lowerBound = 100;
        int upperBound = 170;
        System.out.printf("Cars in range of speed from %d to %d\n",lowerBound,upperBound);
        for(PassengerCar car: park.findBySpeed(lowerBound,upperBound)) {
            System.out.println(car);
        }

        System.out.println("Total cost of taxi park");
        System.out.println(park.cost());

    }
}
