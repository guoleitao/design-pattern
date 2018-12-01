package com.glt.designpattern.bridge;

public class InitMain {

    public static void main(String[] args) {

        /**
         *
         * 场景：
         *  现在有十种不同类型的电视，每种电视都有自己的遥控器，电视变化，对应的遥控器也要变化，
         *  而且如果新增一种电视型号，就要新增一种对应的遥控器
         *
         * 解决：
         *  使用桥接模式制作一个抽象tv接口，在抽象出一个RemoteControl遥控器类，使用RemoteControl类关联（桥接）tv,
         *  将实现予以解耦，而且抽象和实现可以独立扩展互不影响，如想给RemoteControl加个game功能，则不会对现有实现影响
         *
         *
         *
         * 桥接模式：
         *  使抽象和实现解耦，使之都可以独立扩展不会影响对方
         *
         * 使用场景：
         *  当需要使用不同的方式改变接口和实现是使用
         *
         */


        TV mi = new MiTV();
        TV sony = new SonyTV();


        ConcreteRemote miControl = new ConcreteRemote(mi);
        ConcreteRemote sonyControl = new ConcreteRemote(sony);

        miControl.on();
        miControl.setStation(5);
        miControl.nextChannel();

        sonyControl.on();
        sonyControl.setStation(10);
        sonyControl.nextChannel();

    }
}
