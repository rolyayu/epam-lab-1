package com.epam.controller;

import com.epam.entities.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static final int LOWER_BOUND = 100;
    private static final int UPPER_BOUND = 170;

    private static List<PassengerCar> cars;
    private static TaxiPark park;
    private static TaxiParkService service;

    public static void main(String[] args) {
        init();
        printCars();
        sortCars();
        printCars();
        findBySpeed();
        getCost();
    }

    private static void init() {
        cars = new ArrayList<>();

        RoadsterCar roadster = new RoadsterCar(BigDecimal.valueOf(15000), 3);
        roadster.setFuelRate(10);
        roadster.setMark("Mazda");
        roadster.setFuelType(FuelType.PETROL);
        roadster.setTotalMileage(150000);
        roadster.setTwoPlusTwo(true);
        roadster.setMaxSpeed(180);
        cars.add(roadster);

        TargaCar targa = new TargaCar(BigDecimal.valueOf(15000), 1);
        targa.setFuelRate(7);
        targa.setMark("Mitsubishi");
        targa.setFuelType(FuelType.GAS);
        targa.setTotalMileage(14000);
        targa.setTwoPlusTwo(true);
        targa.setMaxSpeed(160);
        targa.setRemovableRoof(true);
        cars.add(targa);

        SedanCar sedan = new SedanCar(BigDecimal.valueOf(20000), 4);
        sedan.setFuelRate(11);
        sedan.setMark("BMW");
        sedan.setFuelType(FuelType.DIESEL);
        sedan.setTotalMileage(30000);
        sedan.setMaxSpeed(120);
        cars.add(sedan);

        UniversalCar universal = new UniversalCar(BigDecimal.valueOf(7000), 2);
        universal.setFuelRate(9);
        universal.setMark("Peugeot");
        universal.setFuelType(FuelType.DIESEL);
        universal.setTotalMileage(60000);
        universal.setMaxSpeed(120);
        cars.add(universal);

        park = new TaxiPark();
        park.setCars(cars);

        service = new TaxiParkService(park);
    }

    private static void printCars() {
        System.out.println(park);
    }

    private static void sortCars() {
        System.out.println("Start of sorting by fuel rate");
        service.sortCars();
        printCars();
        System.out.println("End of sorting by fuel rate");
    }

    private static void findBySpeed() {
        System.out.printf("Cars in range of speed from %d to %d\n", LOWER_BOUND, UPPER_BOUND);
        service.findBySpeed(LOWER_BOUND, UPPER_BOUND).forEach(System.out::println);
    }

    private static void getCost() {
        System.out.println("Total cost of taxi park = " + service.getCost());
    }
}
