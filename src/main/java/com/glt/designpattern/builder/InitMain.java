package com.glt.designpattern.builder;

public class InitMain {

    public static void main(String[] args) {
        /**
         * 生成器/建造者模式
         *  封装一个产品的构造过程，并允许按步骤构造
         *
         *  优点
         *      将一个复杂的对象创建过程封装起来，并且允许对象通过多个步骤创建
         *  特点
         *      经常用来创建爱你组合结构
         *  与工厂模式区别
         *      工厂模式创建对象只有一个步骤，生成器模式有多个步骤
         */

        Builder builder = new Builder();

        Meal breakfast = builder.breakfast();
        breakfast.takeOrder();
        System.out.println();
        Meal lunch = builder.lunch();
        lunch.takeOrder();
        System.out.println();
        Meal dinner = builder.dinner();
        dinner.takeOrder();
        System.out.println();
    }
}
