package com.glt.designpattern.bean.pizza.factoryMethod;

/**
 * 比萨接口，所有比萨实现此接口
 */
public interface Pizza {

    public void prepare();

    public void bake();

    public void cut();

    public void box();
}
