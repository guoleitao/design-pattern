package com.glt.designpattern.builder;

/**
 * 饮品类-啤酒
 */
public class BeerDrink extends Drink {
    @Override
    public String name() {
        return "啤酒";
    }

    @Override
    public float price() {
        return 3;
    }
}
