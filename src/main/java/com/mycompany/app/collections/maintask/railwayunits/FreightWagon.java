package com.mycompany.app.collections.maintask.railwayunits;

public class FreightWagon extends RailwayUnit {
    private int maxLoadCapacity;

    public FreightWagon(int id, String model, int mileage, int price, int maxLoadCapacity) {
        super(id, model, mileage, price);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "FreightWagon{" + "ID = " + super.getId() +
                ", model=" + super.getModel() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                ", maxLoadCapacity=" + maxLoadCapacity+
                '}';
    }
}