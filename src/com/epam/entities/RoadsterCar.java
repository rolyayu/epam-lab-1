package com.epam.entities;

public class RoadsterCar extends SportCar{
    public RoadsterCar(int purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    @Override
    public int getCost() {
        return (int) (super.getCost()*1.1);        //additional sum because of rarity and prestige
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
