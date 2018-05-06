package com.glt.designpattern.factoryPattern.abstractFactory;

import com.glt.designpattern.bean.ingredient.cheese.Cheese;
import com.glt.designpattern.bean.ingredient.cheese.AmericaCheese;
import com.glt.designpattern.bean.ingredient.dough.AmericaDough;
import com.glt.designpattern.bean.ingredient.dough.Dough;
import com.glt.designpattern.bean.ingredient.sauce.AmericaSauce;
import com.glt.designpattern.bean.ingredient.sauce.Sauce;
import com.glt.designpattern.bean.ingredient.veggies.AmericaVeggies;
import com.glt.designpattern.bean.ingredient.veggies.Veggies;

public class AmericaIngredientFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        return new AmericaCheese();
    }

    @Override
    public Dough createDough() {
        return new AmericaDough();
    }

    @Override
    public Sauce createSauce() {
        return new AmericaSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new AmericaVeggies[2];
    }
}
