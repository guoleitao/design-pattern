package com.glt.designpattern.mediator;

/**
 * 房东
 */
public class Landlord extends User {

    Landlord(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void trade(float price) {
        System.out.println("我的出租价格为:" + price);
    }
}
