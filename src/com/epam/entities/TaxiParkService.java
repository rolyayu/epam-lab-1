package com.epam.entities;

import com.epam.comparators.FuelRateComparator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class TaxiParkService {

    private final TaxiPark park;

    public TaxiParkService(TaxiPark park) {
        this.park = park;
    }

    public BigDecimal getCost() {
        BigDecimal totalCost = park.getCars().stream().map(PassengerCar::getCost).reduce(BigDecimal::add).get();
        return totalCost.setScale(2, RoundingMode.FLOOR);
    }

    public void sortCars() {
        park.getCars().sort(new FuelRateComparator());
    }

    public List<PassengerCar> findBySpeed(int lowerBound, int upperBound) {
        return park.getCars().stream().filter(car -> car.matchesSpeed(lowerBound, upperBound)).toList();
    }
}
