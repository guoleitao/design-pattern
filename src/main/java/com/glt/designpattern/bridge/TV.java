package com.glt.designpattern.bridge;

/**
 * 电视接口
 */
public interface TV {

    /**
     * 开
     */
    public void on();

    /**
     * 关
     */
    public void off();

    /**
     * 切换频道
     */
    public void tuneChannel(int channel);
}
