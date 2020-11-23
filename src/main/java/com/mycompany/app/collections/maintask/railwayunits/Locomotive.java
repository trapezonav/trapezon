package com.mycompany.app.collections.maintask.railwayunits;

import com.mycompany.app.collections.maintask.models.EngineType;

public class Locomotive extends RailwayUnit {
    private EngineType engineType;
    private int maxSpeed;

    public Locomotive(int id, String model, int mileage, int price, EngineType engineType, int maxSpeed) {
        super(id, model, mileage, price);
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
    }

    public EngineType getEngine() {
        return engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Locomotive{" + "ID = " + super.getId() +
                ", model=" + super.getModel() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                ", engineType=" + engineType +
                ", maxSpeed=" + maxSpeed+
                '}';
    }
}
