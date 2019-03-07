package com.glt.designpattern.Memento;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 备忘录模式
         *  可以使对象可以返回到之前的状态，如撤销操作、或者学习系统上记住之前的学习状态等
         *
         * 目标
         *  存储关键对象的重要状态
         *  维护关键对象的封装
         *
         */

        Client c = new Client();

        c.startGame(null);
        c.player("1");
        c.player("2");
        Memento memento = c.exitGame();//退出
        ManageMemento.setMemento(memento);//存档


        Client c2 = new Client();
        c2.startGame(ManageMemento.getMemento());//加载档案
        c2.showPlayer();
        c2.player("5");
    }
}
