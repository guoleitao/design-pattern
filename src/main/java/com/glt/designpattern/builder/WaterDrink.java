package com.glt.designpattern.builder;

/**
 * 饮品类-水
 */
public class WaterDrink extends Drink {
    @Override
    public String name() {
        return "水";
    }

    @Override
    public float price() {
        return 1;
    }
}
