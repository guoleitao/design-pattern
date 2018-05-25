package com.glt.designpattern.composite;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 组合模式
         * 允许你将对象组合成树形结构来表现“整体/部分”层次结构，组合能让客户以一致的方式处理个别对象以及对象组合。
         *
         * 组合模式客户程序与复杂元素的内部结构，从而是客户程序可以想处理简单元素一样处理复杂对象。
         */

        /**
         *      测试属性结构如下
         *              A
         *           /    \
         *      leafA1   compositeB
         *               /        \
         *           leafB      compositeC
         *                     /          \
         *                  leafC1      leafC2
         */
        Component compositeA = new Composite();
        Component leafA1 = new Leaf("leafA1");
        compositeA.add(leafA1);

        Component compositeB = new Composite();
        Component leafB = new Leaf("leafB");
        compositeB.add(leafB);
        compositeA.add(compositeB);

        Component compositeC = new Composite();
        Component leafC1 = new Leaf("leafC1");
        Component leafC2 = new Leaf("leafC2");
        compositeC.add(leafC1);
        compositeC.add(leafC2);
        compositeB.add(compositeC);

        //调用顶层容器构件的operate方法，打印所有构件的operate方法
        compositeA.operate();

    }
}
