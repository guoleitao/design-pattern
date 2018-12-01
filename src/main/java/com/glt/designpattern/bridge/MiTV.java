package com.glt.designpattern.bridge;

/**
 * 小米-具体电视类
 */
public class MiTV implements TV {
    @Override
    public void on() {
        System.out.println("open xiaomi  tv ...");
    }

    @Override
    public void off() {
        System.out.println("close xiaomi  tv ...");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println(String.format("change xiaomi  tv channel is %s", channel));
    }
}
