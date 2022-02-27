package entities;

public class TargaCar extends SportCar{
    boolean isRemovableRoof;

    public TargaCar(int purchaseCost, int yearFromPurchase) {
        super(purchaseCost, yearFromPurchase);
    }

    public boolean isRemovableRoof() {
        return isRemovableRoof;
    }

    public void setRemovableRoof(boolean removableRoof) {
        isRemovableRoof = removableRoof;
    }

    @Override
    public int getCost() {
        int cost = super.getCost();
        if(isTwoPlusTwo) cost*=1.05;
        if(isRemovableRoof) cost*=1.02;
        return  cost;
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
