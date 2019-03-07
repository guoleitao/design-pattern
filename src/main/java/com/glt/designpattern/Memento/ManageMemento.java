package com.glt.designpattern.Memento;

/**
 * 备忘录管理类，用来记录存档与获取
 */
public class ManageMemento {

    static Memento memento;

    public static Memento getMemento() {
        return memento;
    }

    public static void setMemento(Memento m) {
        memento = m;
    }
}
