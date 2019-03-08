package com.glt.designpattern.prototype;

public class InitMain {

    public static void main(String[] args) {
        /**
         * 原型模式
         *  通过复制现有的实例来创建新的实例
         */

        ShapeCache.loadShape();

        Shape circle = ShapeCache.getShape("1");
        circle.draw();
        System.out.println("circle hashcode=" + circle.hashCode());
        System.out.println("circle.type hashcode=" + circle.getType().hashCode());

        Shape circle2 = ShapeCache.getShape("1");
        circle2.draw();
        System.out.println("circle2 hashcode=" + circle2.hashCode());
        System.out.println("circle2.type hashcode=" + circle2.getType().hashCode());

        Shape square = ShapeCache.getShape("2");
        square.draw();
        System.out.println("square hashcode=" + square.hashCode());
        System.out.println("square.type hashcode=" + square.getType().hashCode());

        Shape square2 = ShapeCache.getShape("2");
        square2.draw();
        System.out.println("square2 hashcode=" + square2.hashCode());
        System.out.println("square2.type hashcode=" + square2.getType().hashCode());


    }
}
