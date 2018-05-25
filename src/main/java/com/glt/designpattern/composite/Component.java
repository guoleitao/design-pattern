package com.glt.designpattern.composite;

import java.util.List;

/**
 * 抽象构件
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    void operate();

    List<Component> getChild();

}
