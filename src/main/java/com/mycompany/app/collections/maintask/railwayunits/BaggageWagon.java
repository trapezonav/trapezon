package com.mycompany.app.collections.maintask.railwayunits;

public class BaggageWagon extends RailwayUnit {

    private int amountOfBaggage;

    public BaggageWagon(int id, String model, int mileage, int price, int amountOfBaggage) {
        super(id, model, mileage, price);
        this.amountOfBaggage = amountOfBaggage;
    }

    public int getAmountOfBaggage() {
        return amountOfBaggage;
    }

    public void setAmountOfBaggage(int amountOfBaggage) {
        this.amountOfBaggage = amountOfBaggage;
    }

    @Override
    public String toString() {
        return "BaggageWagon{" + "ID = " + super.getId() +
                ", model=" + super.getModel() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                ", amountOfBaggage=" + amountOfBaggage+
                '}';
    }
}
