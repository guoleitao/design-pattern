package com.glt.designpattern.visitor;

public interface Visitor {

    public void visitor(Computer computer);
    public void visitor(Keyboard keyboard);
    public void visitor(Mouse mouse);
    public void visitor(Monitor monitor);
}
