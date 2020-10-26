package com.mycompany.app.collections.maintask.railwayunits;

import com.mycompany.app.collections.maintask.models.LevelOfComfort;

public class PassengerWagon extends RailwayUnit {

    private int passengersCapacity;
    private LevelOfComfort levelOfComfort;


    public PassengerWagon(String id, String model, int mileage, int price, int passengersCapacity, LevelOfComfort levelOfComfort) {
        super(id, model, mileage, price);
        this.passengersCapacity = passengersCapacity;
        this.levelOfComfort = levelOfComfort;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public LevelOfComfort getComfortLevel() {
        return levelOfComfort;
    }

    @Override
    public String toString() {
        return "PassengerWagon{" + "ID = " + super.getId() +
                ", model=" + super.getModel() +
                ", mileage=" + super.getMileage() +
                ", price=" + super.getPrice() +
                ", numberOfPassengers=" + passengersCapacity +
                ", comfortLevel=" + levelOfComfort +
                '}';
    }
}
