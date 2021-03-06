package com.glt.designpattern.singleton;

import java.lang.reflect.Constructor;

public class InitMain {

    public static void main(String[] args) {

//        try {
//            Thread th1 = new Thread() {
//                @Override
//                public void run() {
//                    System.out.println(SingletonOne.getInstance().hashCode());
//                }
//            };
//            Thread th2 = new Thread() {
//                @Override
//                public void run() {
//                    System.out.println(SingletonOne.getInstance().hashCode());
//                }
//            };
//
//            th1.run();
//            th2.run();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        SingletonOneV2 o1 = SingletonOneV2.getInstance();
//        SingletonOneV2 o2 = null;
//        Class<SingletonOneV2> v2Class = SingletonOneV2.class;
//        try {
//            Constructor<SingletonOneV2> v2 = v2Class.getDeclaredConstructor();
//            v2.setAccessible(true);
//            o2 = v2.newInstance();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(o1.hashCode());
//        System.out.println(o2.hashCode());

        SingletonOneV3 o3 = SingletonOneV3.getInstance();
        SingletonOneV3 o4 = null;
        Class<SingletonOneV3> v3Class = SingletonOneV3.class;
        try {
            Constructor<SingletonOneV3> v3 = v3Class.getDeclaredConstructor();
            v3.setAccessible(true);
            o4 = v3.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(o3.hashCode());
        System.out.println(o4.hashCode());


    }
}
