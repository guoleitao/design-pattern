package com.glt.designpattern.bridge;

/**
 * 抽象遥控器类
 */
public abstract class RemoteControl {
    TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void on() {
        tv.on();
    }

    public void off() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }
}
