package com.sai;

class phone{
    public void call(){System.out.println("Phone call");}
    public void sms(){System.out.println("Phone sms");}
}
interface Icamera{
     void click();
     void snap();
}
interface musicplayer{
    void play();
    void stop();
}

class Smartphone extends  phone implements Icamera,musicplayer {
    @Override
    public void click() {
        System.out.println("Smart click");
    }

    @Override
    public void play() {
        System.out.println("Smart play");
    }

    @Override
    public void call() {
        System.out.println("Smart CALL");
    }

    @Override
    public void sms() {
        System.out.println("Smart sms");;
    }

    @Override
    public void stop() {
        System.out.println("Smart stop");
    }

    @Override
    public void snap() {
        System.out.println("Smart snap");
    }
}
public class PractInterfaces {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.call();
        s.click();
        s.play();
        s.sms();
        s.snap();
        s.stop();
    }
}
