package com.glt.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 餐对象，建造者生成的产品
 */
public class Meal {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public void takeOrder(){
        StringBuffer name = new StringBuffer();
        float price = 0;
        StringBuffer packing = new StringBuffer();
        for (Item item: list) {
            name.append(item.name() + ",");
            price += item.price();
            packing.append(item.packing() + ",");
        }
        System.out.println("名称：" + name.substring(0,name.length()-1));
        System.out.println("价格：" + price);
        System.out.println("包装：" + packing.substring(0,packing.length()-1));
    }
}
