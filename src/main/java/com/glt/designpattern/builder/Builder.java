package com.glt.designpattern.builder;

/**
 * 建造者对象
 * 生成最终对象的建造者
 */
public class Builder {
    /**
     * 早餐
     */
    public Meal breakfast(){
        Meal meal = new Meal();
        meal.addItem(new BreadFood());
        meal.addItem(new WaterDrink());
        return meal;
    }

    /**
     * 午餐
     */
    public Meal lunch(){
        Meal meal = new Meal();
        meal.addItem(new PizzaFood());
        meal.addItem(new BeerDrink());
        return meal;
    }

    /**
     * 晚餐
     */
    public Meal dinner(){
        Meal meal = new Meal();
        meal.addItem(new BreadFood());
        meal.addItem(new BeerDrink());
        return meal;
    }
}
