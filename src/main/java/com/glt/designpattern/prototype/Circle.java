package com.glt.designpattern.prototype;

public class Circle extends Shape {

    public Circle(){
        this.setType("circle");
    }
    @Override
    public void draw() {
        System.out.println("this is 圆形");
    }
}
