package com.mycompany.app.collections.maintask;

import com.mycompany.app.collections.maintask.models.LevelOfComfort;
import com.mycompany.app.collections.maintask.railwayunits.BaggageWagon;
import com.mycompany.app.collections.maintask.railwayunits.Locomotive;
import com.mycompany.app.collections.maintask.railwayunits.PassengerWagon;
import com.mycompany.app.collections.maintask.railwayunits.RailwayUnit;

import java.util.ArrayList;
import java.util.Comparator;


public class Train {

    private Locomotive locomotive;
    private ArrayList<RailwayUnit> listOfUnits;

    public Train(Locomotive locomotive, ArrayList<RailwayUnit> listOfUnits) {
        this.locomotive = locomotive;
        this.listOfUnits = listOfUnits;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public ArrayList<RailwayUnit> getListOfUnits() {
        return listOfUnits;
    }

    public void setListOfUnits(ArrayList<RailwayUnit> listOfUnits) {
        this.listOfUnits = listOfUnits;
    }

    public int getNumbersOfPassengers(){
        int numbersOfPassengers = 0;
        for (RailwayUnit railwayUnit: listOfUnits) {
            if (railwayUnit instanceof PassengerWagon){
                numbersOfPassengers += ((PassengerWagon) railwayUnit).getPassengersCapacity();
            }
        }
        return numbersOfPassengers;
    }

    public int getAmountOfBaggage(){
        int amountOfBaggage = 0;
        for (RailwayUnit railwayUnit: listOfUnits) {
            if (railwayUnit instanceof BaggageWagon){
                amountOfBaggage += ((BaggageWagon) railwayUnit).getAmountOfBaggage();
            }
        }
        return amountOfBaggage;
    }

    public void sortByLevelOfComfort(){
        listOfUnits.sort(new Comparator<RailwayUnit>() {
            @Override
            public int compare(RailwayUnit o1, RailwayUnit o2) {
                LevelOfComfort o1level = o1 instanceof PassengerWagon ? ((PassengerWagon) o1).getComfortLevel(): LevelOfComfort.NONE;
                LevelOfComfort o2level = o2 instanceof PassengerWagon ? ((PassengerWagon) o2).getComfortLevel(): LevelOfComfort.NONE;
                return o1level.compareTo(o2level);
            }
        });
    }

    public ArrayList<RailwayUnit> getWagonsWithSetNumberOfPassengers(int mintValue, int maxValue){
        ArrayList<RailwayUnit> wagonsWithSetNumberOfPassengers = new ArrayList<>();
        for (RailwayUnit unit:listOfUnits) {
            if (unit instanceof PassengerWagon){
               if (((PassengerWagon) unit).getPassengersCapacity() > mintValue && ((PassengerWagon) unit).getPassengersCapacity() < maxValue){
                   wagonsWithSetNumberOfPassengers.add(unit);
               }
            }
        }
        return wagonsWithSetNumberOfPassengers;
    }


    @Override
    public String toString() {
        return locomotive.toString() + " " + listOfUnits.toString();
    }
}
