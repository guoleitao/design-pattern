package com.glt.designpattern.visitor;

public class Monitor implements Part{

    public void accept(Visitor visitor){
        visitor.visitor(this);
    }
}
