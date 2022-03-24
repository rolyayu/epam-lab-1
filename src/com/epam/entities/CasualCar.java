package com.epam.entities;

import java.math.BigDecimal;

public abstract class CasualCar extends PassengerCar {
    public CasualCar(BigDecimal purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }
}
