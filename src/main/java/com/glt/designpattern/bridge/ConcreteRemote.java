package com.glt.designpattern.bridge;

/**
 * 具体遥控器类
 */
public class ConcreteRemote extends RemoteControl {

    public int currentStation = 0;

    public ConcreteRemote(TV tv) {
        super(tv);
    }


    public void on() {
        super.on();
    }

    public void off() {
        super.on();
    }


    public void setStation(int currentStation) {
        this.currentStation = currentStation;
        setChannel(this.currentStation);
    }

    public void nextChannel() {
        setChannel(this.currentStation + 1);
    }

    public void prevChannel() {
        setChannel(this.currentStation - 1);
    }
}
