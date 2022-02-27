package entities;

import Controller.FuelRateComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxiPark {
    private PassengerCar[] cars;

    public PassengerCar[] getCars() {
        return cars;
    }

    public void setCars(PassengerCar[] cars) {
        this.cars = cars;
    }

    public int cost() {
        int cost = 0;
        for(PassengerCar car:getCars()) {
            cost+=car.getCost();
        }
        return cost;
    }

    public void sort(){
        Arrays.sort(getCars(),new FuelRateComparator());
    }

    public List<PassengerCar> findBySpeed(int lowerBound,int upperBound) {
        List<PassengerCar> carList = new ArrayList<>();
        for(PassengerCar car:getCars()) {
            if(car.getMaxSpeed()>lowerBound & car.getMaxSpeed()<upperBound) {
                carList.add(car);
            }
        }
        return carList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("TaxiPark {\n");
        for(PassengerCar car:cars) result.append(car).append("\n");
        return result.append("}").toString();
    }
}
