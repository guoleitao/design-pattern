package com.glt.designpattern.bean.pizza.abstraceFactory;

import com.glt.designpattern.factoryPattern.abstractFactory.IngredientFactory;

public class JapanPizza extends AbstractPizza {

    IngredientFactory ingredientFactory;

    public JapanPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(" japan prepare " + name);
        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
