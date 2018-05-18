package com.glt.designpattern.facade;

/**
 * 定义形状外观类
 * 为复杂的各种具体形状类提供统一供外界访问的入口
 */
public class FacadeClass {
    private Circle circle;
    private Square square;
    private Triangle triangle;

    public FacadeClass() {
        circle = new Circle();
        square = new Square();
        triangle = new Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
