package com.glt.designpattern.builder;

/**
 * 饮品项
 */
public abstract class Drink implements Item {
    @Override
    public String packing() {
        return "瓶子";
    }
}
