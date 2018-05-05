package com.glt.designpattern.factoryPattern.factoryMethod;

import com.glt.designpattern.bean.CheesePizza;
import com.glt.designpattern.bean.ClamPizza;
import com.glt.designpattern.bean.GreekPizza;
import com.glt.designpattern.bean.Pizza;

/**
 * NewYork比萨店，通过createPizza方法来创建自己独特类型的比萨
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
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
