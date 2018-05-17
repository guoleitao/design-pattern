package com.glt.designpattern.adapter;

public class InitMain {
    public static void main(String[] args) {

        /**
         * 适配器对象将被适配者转换为目标接口中的方式给客户使用。
         */

        //被适配者，此处也可以是被适配者的子类
        Adaptee adaptee = new Adaptee();

        //适配器
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
