package com.epam.entities;

public enum FuelType {
    GAS("Газ", 30000),
    PETROL("Бензин", 20000),
    DIESEL("Дизель", 40000);

    private final String type;
    private final int averageMileage;

    FuelType(String type, int averageMileage) {
        this.type = type;
        this.averageMileage = averageMileage;
    }

    public String type() {
        return type;
    }

    ;

    public int averageMileage() {
        return averageMileage;
    }

    ;
}
