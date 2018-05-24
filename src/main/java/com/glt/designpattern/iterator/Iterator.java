package com.glt.designpattern.iterator;

/**
 * 迭代器接口
 */
public interface Iterator {
    boolean hasNext();

    Object next();

    void remove();
}
