package com.glt.designpattern.factoryPattern.abstractFactory;

import com.glt.designpattern.bean.ingredient.cheese.Cheese;
import com.glt.designpattern.bean.ingredient.cheese.AsiaCheese;
import com.glt.designpattern.bean.ingredient.dough.Dough;
import com.glt.designpattern.bean.ingredient.dough.AsiaDough;
import com.glt.designpattern.bean.ingredient.sauce.AsiaSauce;
import com.glt.designpattern.bean.ingredient.sauce.Sauce;
import com.glt.designpattern.bean.ingredient.veggies.AsiaVeggies;
import com.glt.designpattern.bean.ingredient.veggies.Veggies;

public class AsiaIngredientFactory implements IngredientFactory {
    @Override
    public Cheese createCheese() {
        return new AsiaCheese();
    }

    @Override
    public Dough createDough() {
        return new AsiaDough();
    }

    @Override
    public Sauce createSauce() {
        return new AsiaSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new AsiaVeggies[2];
    }
}
