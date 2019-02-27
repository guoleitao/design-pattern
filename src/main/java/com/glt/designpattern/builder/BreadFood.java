package com.glt.designpattern.builder;

/**
 * 食品类-面包
 */
public class BreadFood extends Food {
    @Override
    public String name() {
        return "面包";
    }

    @Override
    public float price() {
        return 3;
    }
}
