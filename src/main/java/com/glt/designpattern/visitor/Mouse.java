package com.glt.designpattern.visitor;

public class Mouse implements Part{

    public void accept(Visitor visitor){
        visitor.visitor(this);
    }
}
