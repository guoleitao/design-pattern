package com.glt.designpattern.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitor(Computer computer) {
        System.out.println(" this is computer");
    }

    @Override
    public void visitor(Keyboard keyboard) {
        System.out.println(" this is keyboard");
    }

    @Override
    public void visitor(Mouse mouse) {
        System.out.println(" this is mouse");
    }

    @Override
    public void visitor(Monitor monitor) {
        System.out.println(" this is monitor");
    }
}
