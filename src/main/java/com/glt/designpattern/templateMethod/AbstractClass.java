package com.glt.designpattern.templateMethod;

/**
 * 模板类
 * 模板方法定义为final，禁止子类覆盖
 * init、destory为钩子方法，子类可以选择是否重写者两个方法来达到自己的目的
 */
public abstract class AbstractClass {

    final void execute() {
        init();
        run();
        destory();
    }

    void init() {
        System.out.println("init...");
    }

    abstract void run();

    void destory() {
        System.out.println("destory...");
    }


}
