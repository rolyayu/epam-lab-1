package com.epam.entities;

public abstract class PassengerCar {
    protected int purchaseCost;
    protected int yearFromPurchase;
    protected String mark;
    protected int maxSpeed;
    protected int fuelRate;
    protected int totalMileage;
    protected FuelType fuelType;

    public PassengerCar(int purchaseCost, int yearFromPurchase) {
        this.purchaseCost = purchaseCost;
        this.yearFromPurchase = yearFromPurchase;
    }

    public int getPurchaseCost() {
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


    public String getFuelType() {
        return fuelType.type();
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

    public int getYearFromPurchase() {
        return yearFromPurchase;
    }

    public abstract int getSeats();

    public int getCost(){
        double coefficient = getTotalMileage()/(getPreferredMileage()*yearFromPurchase*1.);
        int totalCost = purchaseCost;
        if (coefficient>1.2) coefficient=1.2;
        else if (coefficient<0.7) coefficient=0.7;
        return (int) (totalCost*coefficient);
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "cost=" + getCost() +
                ", yearFromPurchase= " + yearFromPurchase +
                ", seats=" +getSeats()+
                ", fuelType=" +fuelType+
                ", maxSpeed=" + maxSpeed +
                ", mark='" + mark + '\'' +
                ", totalMileage=" + getTotalMileage()+
                ", fuelRate=" + fuelRate +
                '}';
    }
}
