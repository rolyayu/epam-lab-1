package com.epam.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TargaCar extends SportCar {
    boolean isRemovableRoof;

    public TargaCar(BigDecimal purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    public boolean isRemovableRoof() {
        return isRemovableRoof;
    }

    public void setRemovableRoof(boolean removableRoof) {
        isRemovableRoof = removableRoof;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().multiply(calcCoefficient()).setScale(2, RoundingMode.FLOOR);
    }

    @Override
    protected BigDecimal calcCoefficient() {
        BigDecimal coefficient = super.calcCoefficient();
        if (isRemovableRoof) {
            coefficient = coefficient.multiply(BigDecimal.valueOf(1.02));
        }
        return coefficient;
    }

    @Override
    public String toString() {
        return "TargaCar{" +
                "cost=" + getCost() +
                ", yearFromPurchase=" + yearFromPurchase +
                ", mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", seats= " + getSeats() +
                ", fuelRate=" + fuelRate +
                ", totalMileage=" + totalMileage +
                ", fuelType=" + fuelType +
                ", isTwoPlusTwo=" + isTwoPlusTwo +
                ", isRemovableRoof=" + isRemovableRoof +
                '}';
    }
}
