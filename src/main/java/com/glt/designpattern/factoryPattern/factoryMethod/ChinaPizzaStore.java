package com.glt.designpattern.factoryPattern.factoryMethod;

import com.glt.designpattern.bean.BeiJingPizza;
import com.glt.designpattern.bean.CheesePizza;
import com.glt.designpattern.bean.ClamPizza;
import com.glt.designpattern.bean.GreekPizza;
import com.glt.designpattern.bean.Pizza;
import com.glt.designpattern.bean.ShangHaiPizza;

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
