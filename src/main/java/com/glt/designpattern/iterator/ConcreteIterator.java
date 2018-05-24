package com.glt.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器类，将传入的聚合对象封装成符合规范的迭代器
 */
public class ConcreteIterator implements Iterator {

    public List names;
    private int index = 0;

    public ConcreteIterator(List names) {
        if (names == null) {
            names = new ArrayList();
        }
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return (index < names.size()) && (names.get(index) != null);
    }

    @Override
    public Object next() {
        Object o = names.get(index);
        index++;
        return o;
    }

    @Override
    public void remove() {
        if (index <= 0) {
            return;
        }
        names.remove(names.get(index));
    }
}
