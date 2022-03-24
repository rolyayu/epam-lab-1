package com.epam.entities;

import java.math.BigDecimal;

public class SedanCar extends CasualCar {
    public SedanCar(BigDecimal purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    @Override
    public int getSeats() {
        return 4;
    }

    @Override
    public String toString() {
        return "SedanCar{" +
                "cost=" + getCost() +
                ", yearFromPurchase=" + yearFromPurchase +
                ", mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", seats= " + getSeats() +
                ", fuelRate=" + fuelRate +
                ", totalMileage=" + totalMileage +
                ", fuelType=" + fuelType +
                '}';
    }
}
