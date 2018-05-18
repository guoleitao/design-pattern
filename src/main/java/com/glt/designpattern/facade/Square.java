package com.glt.designpattern.facade;

/**
 * 定义方形实现类
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(" this is square shape");
    }
}
