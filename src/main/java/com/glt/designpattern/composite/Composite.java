package com.glt.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 * 此处operate方法使用递归调用所有子节点的operate方法
 */
public class Composite implements Component {

    List<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void operate() {
        operate(list);
    }

    private void operate(List<Component> childs) {
        for (Component component : list) {
            try {
                component.operate();
            } catch (Exception e) {
                operate(component.getChild());
            }
        }
    }

    @Override
    public List<Component> getChild() {
        return list;

    }
}
