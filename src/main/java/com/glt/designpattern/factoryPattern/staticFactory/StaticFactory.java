package com.glt.designpattern.factoryPattern.staticFactory;

import com.glt.designpattern.bean.CheesePizza;
import com.glt.designpattern.bean.ClamPizza;
import com.glt.designpattern.bean.GreekPizza;
import com.glt.designpattern.bean.Pizza;

/**
 * 创建比萨的简单工厂
 */
public class StaticFactory {
    public static Pizza createPizza(String type){
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
