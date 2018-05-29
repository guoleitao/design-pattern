package com.glt.designpattern.state;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 状态模式
         *      允许对象在内部状态改变时改变它的行为，对象看起来好像是修改了它的类
         *
         *  状态模式与策略模式区别
         *  状态模式与策略模式拥有相同的类图，都会事先定义好一组类（状态或行为）
         *  状态模式会事先定义一组状态执行的顺序，类经过不同的状态时会有不同的行为，即通过状态的改变来控制类的行为
         *  策略模式不会预先定义状态转换的顺序，通常是通过组合和委托来拥有不同的行为或算法
         *
         */

        /**
         * 测试自动售货机代码
         * 有三个状态：已投币状态、未投币状态、商品售罄状态
         * 有三个动作：投币，退币，点击出货
         */

        //创建一个有三个商品的自动售货机
        GoodsMachine goodsMachine = new GoodsMachine(3);
        goodsMachine.insertMoney();//投币
        goodsMachine.soldGoods();//点击出货
        goodsMachine.insertMoney();//投币
        goodsMachine.soldGoods();//点击出货
        goodsMachine.insertMoney();//投币
        goodsMachine.soldGoods();//点击出货
        goodsMachine.insertMoney();//投币

    }
}
