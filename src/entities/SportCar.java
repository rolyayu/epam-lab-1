package entities;

public abstract class SportCar extends PassengerCar {
    protected boolean isTwoPlusTwo = false;

    public SportCar(int purchaseCost, int yearFromPurchase) {
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
    public int getCost() {
        return isTwoPlusTwo()? (int) (super.getCost() * 1.05) :super.getCost();
    }
}
