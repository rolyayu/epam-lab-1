package com.epam.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoadsterCar extends SportCar {
    public RoadsterCar(BigDecimal purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().multiply(calcCoefficient()).setScale(2, RoundingMode.FLOOR);
    }

    @Override
    protected BigDecimal calcCoefficient() {
        return super.calcCoefficient().multiply(BigDecimal.valueOf(1.1));        //additional sum because of rarity and prestige
    }

    @Override
    public String toString() {
        return "RoadsterCar{" +
                "cost=" + getCost() +
                ", yearFromPurchase=" + yearFromPurchase +
                ", mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", seats= " + getSeats() +
                ", fuelRate=" + fuelRate +
                ", totalMileage=" + totalMileage +
                ", fuelType=" + fuelType +
                ", isTwoPlusTwo=" + isTwoPlusTwo +
                '}';
    }
}
