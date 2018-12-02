package com.glt.designpattern.visitor;

public class InitMain {


    public static void main(String[] args) {
        /**
         * 访问者模式
         *  当外部需要访问一个组合系统中所有对象的状态时，可以定义一个访问者类，
         *  通过访问者类访问组合系统中所有对象的状态，外部系统只需要对接访问者类即可获取到组合系统中所有对象的状态
         *
         * 特点
         *  允许对组合结构中加入新的操作，无需修改结构本身
         *  想要加入新操作比较容易
         *  访问者所进行的操作代码集中在一起，方便管理
         *  访问者会打破组合的封装
         */


        Computer computer = new Computer();

        Visitor v = new ConcreteVisitor();

        computer.accept(v);
    }




}
