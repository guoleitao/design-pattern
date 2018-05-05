package com.glt.designpattern.factoryPattern;

import com.glt.designpattern.bean.Pizza;
import com.glt.designpattern.factoryPattern.factoryMethod.ChinaPizzaStore;
import com.glt.designpattern.factoryPattern.simpleFactory.SimpleFactory;
import com.glt.designpattern.factoryPattern.simpleFactory.SimplePizzaStore;
import com.glt.designpattern.factoryPattern.staticFactory.StaticPizzaStore;

public class InitMain {


    public static void main(String[] args) {

        //简单工厂
        // 将创建比萨（createPizza方法）的代码封装进一个类
        //如果后期创建比萨有改变只需要修改简单工厂即可，所有的比萨店都不用修改，但是需要预先创建一个简单工厂实例
        //如果创建比萨的行为发生改变，可以通过继承简单工厂来修改
        SimpleFactory simpleFactory = new SimpleFactory();
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(simpleFactory);
        Pizza pizza = simplePizzaStore.orderPizza("cheese");
        System.out.println("user get pizza:" + pizza);

        //静态工厂
        // 不需要预先实例化工厂对象，其他特点同简单工厂
        //缺点是不能通过继承来改变创建比萨（createPizza方法）的行为，即如果创建比萨的行为发生改变只能修改静态工厂方
        StaticPizzaStore staticPizzaStore = new StaticPizzaStore();
        Pizza pizza1 = staticPizzaStore.orderPizza("cheese");
        System.out.println("user get pizza:" + pizza1);


        //工厂方法
        // 定义一个工厂类，并将创建比萨（工厂方法）的方法，每个比萨店都通过继承工厂类来创建不同风味的比萨
        // 也可以将创建比萨的方法设置为抽象的（如果工厂方法为抽象，则工厂类也必须为抽象类），每个比萨店通过实现自己的抽象工厂方法来创建自己独特风味的比萨
        // 此处使用了参数type，即所谓的“参数化工厂方法”，当然如果工厂只产生一种对象则不需要参数化
        ChinaPizzaStore chinaPizzaStore = new ChinaPizzaStore();
        Pizza pizza2 = chinaPizzaStore.orderPizza("bj");
        System.out.println("user get BeiJing pizza:" + pizza2);
        Pizza pizza3 = chinaPizzaStore.orderPizza("sh");
        System.out.println("user get ShangHai pizza:" + pizza3);

        // 工厂方法与简单工厂的差异
        // 简单工厂是将全部的事情在同一个地方处理完成。
        // 工厂方法则是提供了一套框架，让子类通过继承来决定如何实现，既可以使用框架的默认实现也可以自定义独特的实现。相对于简单工厂，前者有更大的弹性。


    }
}
