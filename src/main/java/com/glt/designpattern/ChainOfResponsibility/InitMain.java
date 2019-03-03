package com.glt.designpattern.ChainOfResponsibility;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 责任链模式
         *  将发送者与接收者解耦，为请求创建了一个接收者对象的链，使链上的所有对象都可能处理这个请求
         *
         * 特点
         *  可以通过改变链内的成员或改变他们的顺次，允许动态的新增或删除责任
         *
         * 优点：
         *  降低了耦合，用户不需要知道链的内容和结构，增强了灵活性，用户可以增删链的结构和通过调整链顺序来达到目的。
         * 缺点：
         *  链过长会导致定位问题和调试困难，请求不一定被链处理
         */
    }
}
