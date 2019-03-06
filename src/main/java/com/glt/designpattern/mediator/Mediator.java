package com.glt.designpattern.mediator;

/**
 * 中介者对象
 */
public class Mediator {

    void trade(User user,float price){
        user.trade(price);
    }
}
