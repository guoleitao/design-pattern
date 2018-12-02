package com.glt.designpattern.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> map = new Hashtable<>();

    public static void loadShape(){
        Circle circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(),circle);
        Square square = new Square();
        square.setId("2");
        map.put(square.getId(),square);
    }

    public static Shape getShape(String id){

        Shape shape = map.get(id);

        return (Shape) shape.clone();
    }
}
