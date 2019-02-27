package com.glt.designpattern.builder;

/**
 * 食品项
 */
public abstract class Food implements Item{

    @Override
    public String packing() {
        return "盒子";
    }
}
