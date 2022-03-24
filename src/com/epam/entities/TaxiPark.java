package com.epam.entities;

import com.epam.comparators.FuelRateComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxiPark {
    private List<PassengerCar> cars;

    public List<PassengerCar> getCars() {
        return cars;
    }

    public void setCars(List<PassengerCar> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("TaxiPark {\n");
        cars.forEach(car-> result.append(car).append("\n"));
        return result.append("}").toString();
    }
}
