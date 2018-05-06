package com.glt.designpattern.factoryPattern.abstractFactory;

import com.glt.designpattern.bean.ingredient.cheese.Cheese;
import com.glt.designpattern.bean.ingredient.dough.Dough;
import com.glt.designpattern.bean.ingredient.sauce.Sauce;
import com.glt.designpattern.bean.ingredient.veggies.Veggies;

public interface IngredientFactory {

    public Cheese createCheese();
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();


}
