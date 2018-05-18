package com.glt.designpattern.facade;

/**
 * 定义三角形实现类
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" this is triangle shape");
    }
}
