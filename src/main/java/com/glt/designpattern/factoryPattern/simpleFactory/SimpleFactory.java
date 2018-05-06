package com.glt.designpattern.factoryPattern.simpleFactory;

import com.glt.designpattern.bean.pizza.factoryMethod.CheesePizza;
import com.glt.designpattern.bean.pizza.factoryMethod.ClamPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.GreekPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;

/**
 * 创建比萨的简单工厂
 */
public class SimpleFactory{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if ("greek".equals(type)){
            pizza = new GreekPizza();
        }else if ("clam".equals(type)){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
