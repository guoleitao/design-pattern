package com.glt.designpattern.singleton;

/**
 * 懒汉式V2（内部类中创建对象，只有在第一次调用getInstance()时候才会加载内部类并且创建SingletonOneV3的实例化对象）
 * 1.通过内部类实例化对象
 * 2.通过静态方法获取内部类实例化的对象
 * 3.通过synchronized保证不被反射破坏
 */
public class SingletonOneV3 {

    private static boolean inited = false;

    private SingletonOneV3() {
        synchronized (SingletonOneV3.class) {
            if (inited == false) {
                inited = !inited;
            } else {
                throw new RuntimeException("单例被破坏，不能创建实例");
            }
        }
    }

    static class SingletonInner {
        private static SingletonOneV3 instance = new SingletonOneV3();
    }

    public static SingletonOneV3 getInstance() {
        return SingletonInner.instance;
    }
}
