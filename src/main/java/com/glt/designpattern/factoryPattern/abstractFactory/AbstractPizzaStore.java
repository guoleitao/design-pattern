package com.glt.designpattern.factoryPattern.abstractFactory;

import com.glt.designpattern.bean.pizza.abstraceFactory.AbstractPizza;

/**
 * 抽象比萨店，所有比萨店需要继承此类
 */
public abstract class AbstractPizzaStore {

    /**
     * 创建订单的方法设置为final类型防止被子类继承（也可以不设置成final）
     * @param type
     * @return
     */
    public final AbstractPizza orderPizza(String type){
        AbstractPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract AbstractPizza createPizza(String type);


}
