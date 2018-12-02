package com.glt.designpattern.visitor;

public class Computer implements Part {
    private Part[] parts;

    public Computer() {
        parts = new Part[]{new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(Visitor visitor) {

        for (Part part: parts) {
            part.accept(visitor);
        }
        visitor.visitor(this);
    }


}
