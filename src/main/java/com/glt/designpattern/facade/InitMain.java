package com.glt.designpattern.facade;

public class InitMain {
    public static void main(String[] args) {

        /**
         * 外观模式
         *  通过外观类给复杂的子系统提供统一的访问入口，外部通过外观类访问各个子系统
         *  外观类降低了外部系统与各个子系统的耦合性
         */

        //外观类
        FacadeClass facade = new FacadeClass();

        //通过访问外观类，实现与Circle子类的解耦
        facade.drawCircle();

        //通过访问外观类，实现与Square子类的解耦
        facade.drawSquare();

        //通过访问外观类，实现与Triangle子类的解耦
        facade.drawTriangle();

    }
}
