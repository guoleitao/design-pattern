package com.glt.designpattern.strategy;

/**
 * 乘法策略类
 */
public class MultStrategy implements Strategy {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}
