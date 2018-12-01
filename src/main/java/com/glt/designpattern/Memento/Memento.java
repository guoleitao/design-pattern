package com.glt.designpattern.Memento;

public class Memento {
    private String status;

    public String getCurrStatus(){
        return status;
    }

    public void saveStatus(String curr){
        this.status = curr;
    }
}
