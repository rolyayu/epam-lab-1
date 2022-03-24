package com.epam.entities;

public class SedanCar extends CasualCar {
    public SedanCar(int purchaseCost, int yearFromPurchase) {
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
