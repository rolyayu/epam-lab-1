package com.epam.comparators;

import com.epam.entities.PassengerCar;

import java.util.Comparator;

public class FuelRateComparator implements Comparator<PassengerCar> {
    @Override
    public int compare(PassengerCar o1, PassengerCar o2) {
        return o1.getFuelRate() - o2.getFuelRate();
    }
}
