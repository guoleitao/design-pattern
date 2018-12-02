package com.glt.designpattern.prototype;

public class Square extends Shape {

    public Square(){
        this.setType("square");
    }
    @Override
    public void draw() {
        System.out.println("this is 正方形");
    }
}
