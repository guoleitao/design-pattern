package com.glt.designpattern.interpreter;

public class VarExpression implements Expression {

    private String exp;

    public VarExpression(String exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(String con) {
        return con.contains(this.exp);
    }
}
