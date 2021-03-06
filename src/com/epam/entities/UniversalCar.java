package com.epam.entities;

import java.math.BigDecimal;

public class UniversalCar extends CasualCar {
    public UniversalCar(BigDecimal purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    @Override
    public int getSeats() {
        return 5;
    }

    @Override
    public String toString() {
        return "UniversalCar{" +
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
