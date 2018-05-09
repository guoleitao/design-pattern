package com.glt.designpattern.singleton;

public class InitMain {

    public static void main(String[] args) {

        try {
            Thread th1 = new Thread() {
                @Override
                public void run() {
                    System.out.println(SingletonOne.getInstance().hashCode());
                }
            };
            Thread th2 = new Thread() {
                @Override
                public void run() {
                    System.out.println(SingletonOne.getInstance().hashCode());
                }
            };

            th1.run();
            th2.run();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
