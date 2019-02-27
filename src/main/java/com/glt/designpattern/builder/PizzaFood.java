package com.glt.designpattern.builder;

/**
 * 食品类-披萨
 */
public class PizzaFood extends Food {
    @Override
    public String name() {
        return "披萨";
    }

    @Override
    public float price() {
        return 5;
    }
}
