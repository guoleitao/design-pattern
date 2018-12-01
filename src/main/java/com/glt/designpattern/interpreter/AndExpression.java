package com.glt.designpattern.interpreter;

public class AndExpression implements Expression {

    private VarExpression exp1;
    private VarExpression exp2;

    public AndExpression(VarExpression str1, VarExpression str2) {
        this.exp1 = str1;
        this.exp2 = str2;
    }

    @Override
    public boolean interpret(String data) {
        return exp1.interpret(data) && exp2.interpret(data);
    }
}
