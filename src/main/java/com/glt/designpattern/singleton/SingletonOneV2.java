package com.glt.designpattern.singleton;

/**
 * 懒汉式V2（内部类中创建对象，只有在第一次调用getInstance()时候才会加载内部类并且创建SingletonOneV2的实例化对象）
 * 1.通过内部类实例化对象
 * 2.通过静态方法获取内部类实例化的对象
 */
public class SingletonOneV2 {

    private SingletonOneV2() {
    }

    static class SingletonInner {
        private static SingletonOneV2 instance = new SingletonOneV2();
    }

    public static SingletonOneV2 getInstance() {
        return SingletonInner.instance;
    }
}
