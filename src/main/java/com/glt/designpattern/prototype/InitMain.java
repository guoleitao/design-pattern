package com.glt.designpattern.prototype;

public class InitMain {

    public static void main(String[] args) {
        /**
         * 原型模式
         *  通过复制现有的实例来创建新的实例
         */



        ShapeCache.loadShape();

        Shape shape = ShapeCache.getShape("1");
        shape.draw();
        Shape shape2 = ShapeCache.getShape("2");
        shape2.draw();
    }
}
