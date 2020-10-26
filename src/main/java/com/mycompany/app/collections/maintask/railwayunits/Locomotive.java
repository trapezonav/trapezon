package com.mycompany.app.collections.maintask.railwayunits;

import com.mycompany.app.collections.maintask.models.Engine;

public class Locomotive extends RailwayUnit {

    private Engine engine;
    private int maxSpeed;


    public Locomotive(String id, String model, int mileage, int price, Engine engine, int maxSpeed) {
        super(id, model, mileage, price);
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return null;
    }
}