package com.glt.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类，管理聚合对象，通过createIterator将生成符合规范的的迭代器
 */
public class ConcreteAggregate implements Aggregate {

    List list = new ArrayList();

    public ConcreteAggregate() {
        addItem("张1");
        addItem("张2");
        addItem("张3");
        addItem("张4");
        addItem("张5");
        addItem("张6");
    }


    public void addItem(String name) {
        list.add(name);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }
}
