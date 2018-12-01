package com.glt.designpattern.flyWeight;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 蝇量模式/享元模式
         *  以共享的方式高效的支持大量的细粒度对象，能够减少运行时对象实例的个数，节省内存
         */


        TreeManager manager = new TreeManager();

        manager.displayTrees();
    }
}
