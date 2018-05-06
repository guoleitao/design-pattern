package com.glt.designpattern.bean.pizza.abstraceFactory;

import com.glt.designpattern.bean.ingredient.cheese.Cheese;
import com.glt.designpattern.bean.ingredient.dough.Dough;
import com.glt.designpattern.bean.ingredient.sauce.Sauce;
import com.glt.designpattern.bean.ingredient.veggies.Veggies;

/**
 * 抽象比萨类，抽象工厂使用
 */
public abstract class AbstractPizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;

    //准备比萨原料，需要子类实现自己的方法
    public abstract void prepare();

    public void bake() {
        System.out.println("烘烤");
    }

    public void cut() {
        System.out.println("切成三角形");
    }

    public void box() {
        System.out.println("比萨装进包装盒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
//        if (dough != null) {
//            result.append(dough);
//            result.append("\n");
//        }
//        if (sauce != null) {
//            result.append(sauce);
//            result.append("\n");
//        }
//        if (cheese != null) {
//            result.append(cheese);
//            result.append("\n");
//        }
//        if (veggies != null) {
//            for (int i = 0; i < veggies.length; i++) {
//                result.append(veggies[i]);
//                if (i < veggies.length-1) {
//                    result.append(", ");
//                }
//            }
//            result.append("\n");
//        }
        return result.toString();

    }
}
