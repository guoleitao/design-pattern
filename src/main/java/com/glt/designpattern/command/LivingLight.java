package com.glt.designpattern.command;

/**
 * 客厅灯光（具体接收者）
 */
public class LivingLight implements Light {
    @Override
    public void on() {
        System.out.println("living light is on");
    }

    @Override
    public void off() {
        System.out.println("living light is off");
    }
}
