package com.glt.designpattern.mediator;

/**
 * 抽象用户类
 */
public abstract class User {

    Mediator mediator;

    /**
     * 交易
     * @param price
     */
    void trade(float price) {

    }

    User(Mediator mediator) {
        this.mediator = mediator;
    }

}
