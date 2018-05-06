package com.glt.designpattern.factoryPattern;

import com.glt.designpattern.bean.pizza.abstraceFactory.AbstractPizza;
import com.glt.designpattern.bean.pizza.factoryMethod.Pizza;
import com.glt.designpattern.factoryPattern.abstractFactory.AbstractPizzaStore;
import com.glt.designpattern.factoryPattern.abstractFactory.AmericaPizzaStore;
import com.glt.designpattern.factoryPattern.abstractFactory.AsiaPizzaStore;
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

        // 工厂方法与简单工厂的区别
        // 简单工厂是将全部的事情在同一个地方处理完成。
        // 工厂方法则是提供了一套框架，让子类通过继承来决定如何实现，既可以使用框架的默认实现也可以自定义独特的实现。相对于简单工厂，前者有更大的弹性。



        //抽象工厂
        // 提供一个接口，用于创建相关或者依赖对象的家族（即依赖对象的一系列产品对象），而不需要明确指定具体类，通过接口来创建整个产品家族。
        //抽象工厂遵循依赖倒置原则：
        //  依赖抽象，不依赖具体类
        //  高层组件不依赖底层组件，并且高层组件底层组件都依赖抽象
        AbstractPizzaStore americaPizzaStore = new AmericaPizzaStore();
        AbstractPizza usaPizza = americaPizzaStore.orderPizza("USA");
        System.out.println("user get USA pizza :" + usaPizza);
        AbstractPizzaStore asiaPizzaStore = new AsiaPizzaStore();
        AbstractPizza japanPizza = asiaPizzaStore.orderPizza("japan");
        System.out.println("user get Japan pizza :" + japanPizza);

        // 工厂方法与抽象工厂的区别
        // 工厂方法与抽象工厂都是负责创建对象，工厂方法使用继承的方式创建对象，即创建对象需要扩展一个类并覆盖它的工厂方法，
        //其实就是通过子类来创建对象，使用这种方式用户只需要知道他们所使用的抽象类型就可以了，而由子类来负责决定具体类型，也就是说工厂方法只负责将客户从具体类型中解耦
        // 抽象工厂允许客户创建对象的家族，而无需指定他们的具体类
        // 抽象工厂提供了一个创建产品家族的接口，通过其子类定义创建各种产品的方法，使用工厂方法将各种相关产品集合起来。




    }
}
