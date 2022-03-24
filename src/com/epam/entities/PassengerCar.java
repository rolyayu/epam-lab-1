package com.epam.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class PassengerCar {
    protected BigDecimal purchaseCost;
    protected int yearFromPurchase;
    protected String mark;
    protected int maxSpeed;
    protected int fuelRate;
    protected int totalMileage;
    protected FuelType fuelType;

    public PassengerCar(BigDecimal purchaseCost, int yearFromPurchase) {
        this.purchaseCost = purchaseCost;
        this.yearFromPurchase = yearFromPurchase;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(int fuelRate) {
        this.fuelRate = fuelRate;
    }

    public int getPreferredMileage() {
        return fuelType.averageMileage();
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(int totalMileage) {
        this.totalMileage = totalMileage;
    }

    public abstract int getSeats();

    public BigDecimal getCost() {
        BigDecimal totalCost = getPurchaseCost();
        return totalCost.multiply(calcCoefficient()).setScale(2, RoundingMode.FLOOR);
    }

    protected BigDecimal calcCoefficient() {
        BigDecimal coefficient = BigDecimal.valueOf(getTotalMileage() / (getPreferredMileage() * yearFromPurchase * 1.));
        if (coefficient.doubleValue() > 1.2) {
            coefficient = BigDecimal.valueOf(1.2);
        }
        if (coefficient.doubleValue() < 0.7) {
            coefficient = BigDecimal.valueOf(0.7);
        }
        return coefficient;
    }

    public boolean matchesSpeed(int lowerBound, int upperBound) {
        return this.maxSpeed > lowerBound && this.maxSpeed < upperBound;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "cost=" + getCost() +
                ", yearFromPurchase= " + yearFromPurchase +
                ", seats=" + getSeats() +
                ", fuelType=" + fuelType +
                ", maxSpeed=" + maxSpeed +
                ", mark='" + mark + '\'' +
                ", totalMileage=" + getTotalMileage() +
                ", fuelRate=" + fuelRate +
                '}';
    }
}
