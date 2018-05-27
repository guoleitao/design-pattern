package com.glt.designpattern.strategy;

/**
 * 计算器类
 * 通过动态的传入对应策略来实现计算最终结果
 */
public class Calculator {

    Strategy strategy;

    Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    int execute(int a, int b) {
        return strategy.operate(a, b);
    }
}
