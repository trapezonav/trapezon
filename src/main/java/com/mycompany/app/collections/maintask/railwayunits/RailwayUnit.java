package com.mycompany.app.collections.maintask.railwayunits;

public abstract class RailwayUnit {
    private int id;
    private String model;
    private int mileage;
    private int price;

    public RailwayUnit(int id, String model, int mileage, int price) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
