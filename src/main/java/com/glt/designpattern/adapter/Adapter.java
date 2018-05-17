package com.glt.designpattern.adapter;

/**
 * 适配器类
 * <p>
 * 适配器类将被适配者中的方法转换为目标接口中最终需要的方法
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
