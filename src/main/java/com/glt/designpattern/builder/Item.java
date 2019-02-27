package com.glt.designpattern.builder;

/**
 * 每一餐需要的子项
 */
public interface Item {

    public String name();

    public float price();

    public String packing();
}
