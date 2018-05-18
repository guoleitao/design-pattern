package com.glt.designpattern.facade;

/**
 * 定义圆形实现类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(" this is circle shape");
    }
}
