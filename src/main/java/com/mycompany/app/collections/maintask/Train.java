package com.mycompany.app.collections.maintask;

import com.mycompany.app.collections.maintask.railwayunits.PassengerWagon;
import com.mycompany.app.collections.maintask.railwayunits.RailwayUnit;

import java.util.List;

public class Train {

    private List<RailwayUnit> listOfUnits;

    public Train(List<RailwayUnit> listOfUnits) {
        this.listOfUnits = listOfUnits;
    }

    public List<RailwayUnit> getListOfUnits() {
        return listOfUnits;
    }

    public void setListOfUnits(List<RailwayUnit> listOfUnits) {
        this.listOfUnits = listOfUnits;
    }

}
