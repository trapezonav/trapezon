package com.mycompany.app.collections.maintask;

import com.mycompany.app.collections.maintask.models.Engine;
import com.mycompany.app.collections.maintask.models.LevelOfComfort;
import com.mycompany.app.collections.maintask.railwayunits.BaggageWagon;
import com.mycompany.app.collections.maintask.railwayunits.Locomotive;
import com.mycompany.app.collections.maintask.railwayunits.PassengerWagon;
import com.mycompany.app.collections.maintask.railwayunits.RailwayUnit;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<RailwayUnit> railwayUnitList = new ArrayList<>();
        railwayUnitList.add(new PassengerWagon(123,"Pl-E85",12000, 5000,200, LevelOfComfort.ECONOMY));
        railwayUnitList.add(new PassengerWagon(1,"SW-zx100",7000, 20000,50, LevelOfComfort.BUSINESS));
        railwayUnitList.add(new PassengerWagon(12,"SW-zx400",12000, 18000,56, LevelOfComfort.BUSINESS));
        railwayUnitList.add(new PassengerWagon(18,"Pl-E14",12000, 6000,150, LevelOfComfort.ECONOMY));
        railwayUnitList.add(new PassengerWagon(111,"C-878",12000, 4500,100, LevelOfComfort.COMFORT));
        railwayUnitList.add(new BaggageWagon(444,"B-15D", 43000, 8000, 400));
        railwayUnitList.add(new BaggageWagon(456,"B-167", 74000, 7000, 350));

        Train train = new Train(new Locomotive(1234,"Power4000",100000,50000, Engine.DIESEL,120),railwayUnitList);

        System.out.println(train.getNumbersOfPassengers());
        System.out.println(train.getAmountOfBaggage());
        train.sortByLevelOfComfort();
        System.out.println(train);
        System.out.println(train.getWagonsWithSetNumberOfPassengers(100,250));





    }

}
