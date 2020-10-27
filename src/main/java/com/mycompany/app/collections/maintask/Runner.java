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
        railwayUnitList.add(new PassengerWagon(123,"Plackart",12000, 2000,200, LevelOfComfort.ECONOMY));
        railwayUnitList.add(new PassengerWagon(1,"Plackart",12000, 2000,200, LevelOfComfort.BUSINESS));
        railwayUnitList.add(new PassengerWagon(12,"Plackart",12000, 2000,300, LevelOfComfort.BUSINESS));
        railwayUnitList.add(new PassengerWagon(18,"Plackart",12000, 2000,400, LevelOfComfort.ECONOMY));
        railwayUnitList.add(new PassengerWagon(111,"Kupe",12000, 2000,100, LevelOfComfort.COMFORT));
        railwayUnitList.add(new BaggageWagon(444,"Baggage", 43000, 1000, 400));

        Train train = new Train(new Locomotive(1234,"Power4000",100000,50000, Engine.DIESEL,120),railwayUnitList);

        System.out.println(train.getNumbersOfPassengers());
        System.out.println(train.getAmountOfBaggage());
        train.sortByLevelOfComfort();
        System.out.println(train);
        System.out.println(train.getWagonsWithSetNumberOfPassengers(100,250));




    }

}
