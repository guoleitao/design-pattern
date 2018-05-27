package com.glt.designpattern.strategy;

/**
 * 加法策略类
 */
public class AddStrategy implements Strategy {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
