package com.glt.designpattern.factoryPattern.abstractFactory;

import com.glt.designpattern.bean.pizza.abstraceFactory.AbstractPizza;
import com.glt.designpattern.bean.pizza.abstraceFactory.CanadaPizza;
import com.glt.designpattern.bean.pizza.abstraceFactory.IndiaPizza;
import com.glt.designpattern.bean.pizza.abstraceFactory.JapanPizza;
import com.glt.designpattern.bean.pizza.abstraceFactory.USAPizza;

/**
 * America比萨店，通过createPizza方法来创建自己独特类型的比萨
 */
public class AmericaPizzaStore extends AbstractPizzaStore {

    IngredientFactory ingredientFactory = new AsiaIngredientFactory();

    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if ("USA".equals(type)) {
            pizza = new USAPizza(ingredientFactory);
            pizza.setName("USA");
        } else if ("canada".equals(type)) {
            pizza = new CanadaPizza(ingredientFactory);
            pizza.setName("Canada");
        }
        return pizza;
    }
}
