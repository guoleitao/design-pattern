package com.glt.designpattern.interpreter;

public class InitMain {
    public static void main(String[] args) {
        /**
         * 解释器模式
         *  给定一个语言，定义它的语法表示，并使用一个解释器来解释语法或表达式
         *
         * 特点
         *  每一个语法规则标识一个类，方便实现语言
         *  因为一个语法由一个类表示，因此可以轻易的改变或者扩展新的语法规则
         *  可以在类中加入新的方法来增加新的行为
         *
         * 应用场景
         *  可以用于sql解析，或者特殊符号处理等
         */

        VarExpression mail = new VarExpression("mail");
        VarExpression phone = new VarExpression("phone");

        AndExpression andExpression = new AndExpression(mail, phone);
        boolean b = andExpression.interpret("this contarin mail and phone");
        System.out.println(b);

    }
}
