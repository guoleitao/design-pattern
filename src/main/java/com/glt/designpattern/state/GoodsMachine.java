package com.glt.designpattern.state;

/**
 * 自动售货机类
 * 内部持有一个状态，可以流转为所有状态
 */
public class GoodsMachine {
    private State hasMoney;
    private State noMoney;
    private State soldOutGoods;

    //售货机初始商品为0
    private int count = 0;
    //售货机初始为售罄状态
    private State state = soldOutGoods;

    GoodsMachine(int count) {
        hasMoney = new HasMoney(this);
        noMoney = new NoMoney(this);
        soldOutGoods = new SoldOutGoods(this);
        this.count = count;
        if (count > 0) {
            this.state = noMoney;
        }
    }

    void insertMoney() {
        state.insertMoney();
    }

    void soldGoods() {
        state.soldGoods();
    }

    public State getHasMoney() {
        return hasMoney;
    }

    public void setHasMoney(State hasMoney) {
        this.hasMoney = hasMoney;
    }

    public State getNoMoney() {
        return noMoney;
    }

    public void setNoMoney(State noMoney) {
        this.noMoney = noMoney;
    }

    public State getSoldOutGoods() {
        return soldOutGoods;
    }

    public void setSoldOutGoods(State soldOutGoods) {
        this.soldOutGoods = soldOutGoods;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
