package com.glt.designpattern.state;

/**
 * 自动售货机状态接口
 */
public interface State {

    /**
     * 投币
     */
    void insertMoney();

    /**
     * 退币
     */
    void deleteMoney();

    /**
     * 出货
     */
    void soldGoods();
}
