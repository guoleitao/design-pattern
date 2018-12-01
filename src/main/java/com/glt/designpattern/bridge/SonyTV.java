package com.glt.designpattern.bridge;

/**
 * 索尼-具体电视类
 */
public class SonyTV implements TV {
    @Override
    public void on() {
        System.out.println("open sony  tv ...");
    }

    @Override
    public void off() {
        System.out.println("close sony  tv ...");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println(String.format("change sony  tv channel is %s", channel));
    }
}
