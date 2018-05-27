package com.glt.designpattern.templateMethod;

/**
 * game类实现自己的run方法
 * 并且使用钩子方法destory来达到在游戏销毁前保存游戏信息
 */
public class GameClass extends AbstractClass {
    @Override
    void run() {
        System.out.println("play game....");
    }

    @Override
    void destory() {
        System.out.println("save game info...");
        super.destory();
    }
}
