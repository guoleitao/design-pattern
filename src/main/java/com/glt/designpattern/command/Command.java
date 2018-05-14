package com.glt.designpattern.command;

/**
 * 抽象命令接口
 */
public interface Command {

    public void execute();

    public void undo();
}
