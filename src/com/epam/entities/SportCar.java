package com.epam.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class SportCar extends PassengerCar {
    protected boolean isTwoPlusTwo = false;

    public SportCar(BigDecimal purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    public boolean isTwoPlusTwo() {
        return isTwoPlusTwo;
    }

    public void setTwoPlusTwo(boolean twoPlusTwo) {
        isTwoPlusTwo = twoPlusTwo;
    }

    @Override
    public int getSeats() {
        return isTwoPlusTwo()?4:2;
    }

    @Override
    public BigDecimal getCost() {
        return getPurchaseCost().multiply(calcCoefficient()).setScale(2, RoundingMode.FLOOR);
    }

    @Override
    protected BigDecimal calcCoefficient() {
        return isTwoPlusTwo()? super.calcCoefficient().multiply(BigDecimal.valueOf(1.05)):super.calcCoefficient();
    }
}
