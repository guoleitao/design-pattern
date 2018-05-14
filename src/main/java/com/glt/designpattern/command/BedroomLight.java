package com.glt.designpattern.command;

/**
 * 卧室灯光（具体接收者）
 */
public class BedroomLight implements Light {
    @Override
    public void on() {
        System.out.println("bedroom light is on");
    }

    @Override
    public void off() {
        System.out.println("bedroom light is off");
    }
}
