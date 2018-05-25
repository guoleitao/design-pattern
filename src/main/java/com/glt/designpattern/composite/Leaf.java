package com.glt.designpattern.composite;

import java.util.List;

/**
 * 叶子构件
 * 不支持add、remove、getChild等方法，此处直接抛出异常
 */
public class Leaf implements Component {

    private String name;

    Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持此方法");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持此方法");
    }

    @Override
    public void operate() {
        System.out.println(" this is leaf operate : " + name);
    }

    @Override
    public List<Component> getChild() {
        throw new UnsupportedOperationException("叶子节点不支持此方法");
    }
}
