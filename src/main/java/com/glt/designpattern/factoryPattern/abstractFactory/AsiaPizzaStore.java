package com.glt.designpattern.factoryPattern.abstractFactory;

import com.glt.designpattern.bean.pizza.abstraceFactory.AbstractPizza;
import com.glt.designpattern.bean.pizza.abstraceFactory.IndiaPizza;
import com.glt.designpattern.bean.pizza.abstraceFactory.JapanPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.CheesePizza;
import com.glt.designpattern.bean.pizza.factoryMethod.ClamPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.GreekPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;
import com.glt.designpattern.factoryPattern.factoryMethod.PizzaStore;

/**
 * Asia比萨店，通过createPizza方法来创建自己独特类型的比萨
 */
public class AsiaPizzaStore extends AbstractPizzaStore {

    IngredientFactory ingredientFactory = new AsiaIngredientFactory();

    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if ("japan".equals(type)) {
            pizza = new JapanPizza(ingredientFactory);
            pizza.setName("Japan");
        } else if ("india".equals(type)) {
            pizza = new IndiaPizza(ingredientFactory);
            pizza.setName("India");
        }
        return pizza;
    }
}
