package com.glt.designpattern.Memento;

public class Client {

    Memento memento;

    public void startGame(){
        if(memento==null){
            memento = new Memento();
        }
        System.out.println(" init LastStatus " + memento.getCurrStatus());

    }


    public void player(String s){
        memento.saveStatus(s);
        System.out.println(" player currStatus " + memento.getCurrStatus());

    }

    public void exitGame(){
        if(memento==null){
            memento = new Memento();
        }
        memento.saveStatus(memento.getCurrStatus());
    }
}
