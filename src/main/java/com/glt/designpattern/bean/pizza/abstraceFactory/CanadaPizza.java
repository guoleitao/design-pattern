package com.glt.designpattern.bean.pizza.abstraceFactory;

import com.glt.designpattern.factoryPattern.abstractFactory.IngredientFactory;

public class CanadaPizza extends AbstractPizza {

    IngredientFactory ingredientFactory;

    public CanadaPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(" Canada prepare " + name);
        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
