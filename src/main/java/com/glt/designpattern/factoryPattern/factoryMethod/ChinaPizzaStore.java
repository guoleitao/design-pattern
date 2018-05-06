package com.glt.designpattern.factoryPattern.factoryMethod;

import com.glt.designpattern.bean.pizza.factoryMethod.BeiJingPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;
import com.glt.designpattern.bean.pizza.factoryMethod.ShangHaiPizza;

/**
 * china比萨店，通过createPizza方法来创建自己独特类型的比萨
 */
public class ChinaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if("bj".equals(type)){
            pizza = new BeiJingPizza();
        }else if ("sh".equals(type)){
            pizza = new ShangHaiPizza();
        }
        return pizza;
    }
}
