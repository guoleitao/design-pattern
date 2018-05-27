package com.glt.designpattern.strategy;

/**
 * 减法策略类
 */
public class SubStrategy implements Strategy {
    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}
