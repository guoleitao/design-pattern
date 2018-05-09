package com.glt.designpattern.singleton;

/**
 * 最简单的单例模式（饿汉式）
 *
 */
public class SingletonTwo {
    private static SingletonTwo instance = new SingletonTwo();

    private SingletonTwo() {
    }

    public static SingletonTwo getInstance() {
        return instance;
    }
}
