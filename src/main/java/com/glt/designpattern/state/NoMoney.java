package com.glt.designpattern.state;

/**
 * 未投币状态
 */
public class NoMoney implements State {
    GoodsMachine goodsMachine;

    NoMoney(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        goodsMachine.setState(goodsMachine.getHasMoney());
    }

    @Override
    public void deleteMoney() {
        System.out.println("未投币状态，不能退币");
    }

    @Override
    public void soldGoods() {
        System.out.println("未投币状态，不能出货");
    }
}
