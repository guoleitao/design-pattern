package com.glt.designpattern.state;

/**
 * 已投币状态
 */
public class HasMoney implements State {
    GoodsMachine goodsMachine;

    HasMoney(GoodsMachine goodsMachine) {
        this.goodsMachine = goodsMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已投币状态，不能重复投币");
    }

    @Override
    public void deleteMoney() {
        System.out.println("退币成功");
        goodsMachine.setState(goodsMachine.getNoMoney());
    }

    @Override
    public void soldGoods() {
        System.out.println("出货了，请收好。。。。");
        goodsMachine.setCount(goodsMachine.getCount()-1);
        if(goodsMachine.getCount()>0){
            System.out.println("出货完毕，库存大于0，设置为未投币状态");
            goodsMachine.setState(goodsMachine.getNoMoney());
        }else {
            System.out.println("出货完毕，库存为0，设置为售罄状态");
            goodsMachine.setState(goodsMachine.getSoldOutGoods());
        }
    }

}
