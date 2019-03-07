package com.glt.designpattern.Memento;

/**
 * 备忘录类
 */
public class Memento {
    private String status;

    public String getCurrStatus(){
        return status;
    }

    public void saveStatus(String curr){
        this.status = curr;
    }
}
