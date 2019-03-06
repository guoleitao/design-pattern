package com.glt.designpattern.mediator;

/**
 * 租客
 */
public class Renter extends User {
    Renter(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void trade(float price) {
        System.out.println("我的租入价格为:" + price);
    }
}
