package com.glt.designpattern.visitor;

public class Keyboard implements Part{

    public void accept(Visitor visitor){
        visitor.visitor(this);
    }
}
