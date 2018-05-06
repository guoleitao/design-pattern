package com.glt.designpattern.factoryPattern.factoryMethod;

import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;

/**
 * 抽象比萨店，所有比萨店需要继承此类
 */
public abstract class PizzaStore {

    /**
     * 创建订单的方法设置为final类型防止被子类继承（也可以不设置成final）
     * @param type
     * @return
     */
    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * a.定义为abstract类型的抽象方法，子类必须实现自己的createPizza方法。
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

    /**
     * b.此处定义为一个非abstract类型的createPizza方法，即子类可以使用默认的createPizza方法，不必自己实现createPizza方法
     * @param type
     * @return
     */
//    protected Pizza createPizza(String type){
//        Pizza pizza = null;
//        if("bj".equals(type)){
//            pizza = new BeiJingPizza();
//        }else if ("sh".equals(type)){
//            pizza = new ShangHaiPizza();
//        }
//        return pizza;
//    }


}
