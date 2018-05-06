package com.glt.designpattern.factoryPattern.staticFactory;

import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;

/**
 * 比萨店
 */
public class StaticPizzaStore {

    /**
     * 构造器需要将简单工厂传进来
     *
     * @param simpleFactory
     */
    public StaticPizzaStore() {}

    public Pizza orderPizza(String type) {
        Pizza pizza = StaticFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

