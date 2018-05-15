package com.glt.designpattern.command;

/**
 * 调用者
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }

    public void undoAction() {
        command.undo();
    }

}
