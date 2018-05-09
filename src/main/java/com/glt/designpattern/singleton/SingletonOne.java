package com.glt.designpattern.singleton;

/**
 * 最简单的单例模式（懒汉式）
 */
public class SingletonOne {
    private static SingletonOne instance;

    private SingletonOne() {
    }

    public static synchronized SingletonOne getInstance() {
        if (instance == null) {
            instance = new SingletonOne();
        }
        return instance;
    }
}
