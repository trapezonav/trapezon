package com.mycompany.app.collections.maintask;

import com.mycompany.app.collections.maintask.models.LevelOfComfort;
import com.mycompany.app.collections.maintask.railwayunits.PassengerWagon;

public class Runner {
    public static void main(String[] args) {

        PassengerWagon plackart = new PassengerWagon("123","45645",12000, 2000,200, LevelOfComfort.COMFORT);

        System.out.println(plackart);
    }

}
