package com.glt.designpattern.state;

public class SoldOutGoods implements State {
    GoodsMachine goodsMachine;

    SoldOutGoods(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("售罄状态，不能投币");
    }

    @Override
    public void deleteMoney() {
        System.out.println("售罄状态，不能退币");
    }

    @Override
    public void soldGoods() {
        System.out.println("售罄状态，不能出货");
    }

}
