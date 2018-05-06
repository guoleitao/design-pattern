package com.glt.designpattern.factoryPattern.simpleFactory;

import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;

/**
 * 比萨店
 */
public class SimplePizzaStore {

    SimpleFactory simpleFactory;

    /**
     * 构造器需要将简单工厂传进来
     *
     * @param simpleFactory
     */
    public SimplePizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simpleFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

