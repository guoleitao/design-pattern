package com.glt.designpattern.strategy;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 策略模式
         *      定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于客户。
         */

        Calculator calAdd = new Calculator(new AddStrategy());
        System.out.println("this is add = " + calAdd.execute(5, 10));
        Calculator calSub = new Calculator(new SubStrategy());
        System.out.println("this is sub = " + calSub.execute(5, 10));
        Calculator calMult = new Calculator(new MultStrategy());
        System.out.println("this is mult = " + calMult.execute(5, 10));
        Calculator calDiv = new Calculator(new DivStrategy());
        System.out.println("this is div = " + calDiv.execute(5, 10));

    }
}
