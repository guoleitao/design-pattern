package com.glt.designpattern.mediator;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 中介者模式
         *  使用中介者对象使其他对象之间相互解耦，每个对象只需要向中介者对象发出请求和接受请求即可
         *
         * 特点
         *  增加对象的复用性
         *  通过将控制逻辑集中，简化了系统的维护
         *  让对象之间传递消息变的更加简单
         *  如果系统设计不当， 会造成中介者对象变的过于复杂
         *
         */

        Mediator mediator = new Mediator();

        Landlord landlord = new Landlord(mediator);
        Renter renter = new Renter(mediator);

        landlord.trade(1000);
        renter.trade(1000);

    }
}
