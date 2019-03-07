package com.glt.designpattern.Memento;

public class Client {

    Memento memento;

    public void startGame(Memento m){
        this.memento = m;
        if(memento==null){
            memento = new Memento();
        }
        System.out.println(" init LastStatus " + memento.getCurrStatus());

    }

    public void showPlayer(){
        System.out.println(" current player stats : " + memento.getCurrStatus());
    }

    public void player(String s){
        memento.saveStatus(s);
        System.out.println(" player currStatus " + memento.getCurrStatus());

    }

    public Memento exitGame(){
        if(memento==null){
            memento = new Memento();
        }
        return memento;
    }
}
