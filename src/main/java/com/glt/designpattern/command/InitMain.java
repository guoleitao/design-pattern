package com.glt.designpattern.command;

public class InitMain {
    public static void main(String[] args) {

        /**
         * 命令模式：
         *      将请求封装成一个对象（即command对象），以便使不同的对象来参数化其他对象，来达到将调用者和执行者解耦的目的。
         *
         * 命令对象将接受者与动作放进命令对象中，这个对象只对外暴露一个execute()方法，当方法被调用时候执行这些动作。
         * 而调用者并不知道具体由哪个接受者执行的动作，只知道执行execute()方法就能达到目的。
         */


        //接收者
        LivingLight livingLight = new LivingLight();
//        BedroomLight bedroomLight = new BedroomLight();

        //命令对象
        //开灯命令
        LightOnCommand lightOnCommand = new LightOnCommand(livingLight);
        //关灯命令
        LightOffCommand lightOffCommand = new LightOffCommand(livingLight);


        //调用者
        Invoker invoker = new Invoker();
        invoker.setCommand(lightOnCommand);
        invoker.action();
        invoker.undoAction();
        invoker.setCommand(lightOffCommand);
        invoker.action();
        invoker.undoAction();
    }

}
