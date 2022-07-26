package com.main.test;

import java.security.PublicKey;

class Tv{
    public void switchON(){
        System.out.println(" CRT Switched on ");
    }
    public  void changeChannel(){
        System.out.println(" CRT Tv Chanel changed");
    }
}
class SmartTv extends  Tv{
    public void switchON(){
        System.out.println(" Smart Switched on ");
    }
    public  void changeChannel(){
        System.out.println(" Smart Tv Channel changed");
    }
}
public class MathOver {
    public static void main(String[] args) {
        Tv v = new SmartTv();
        v.changeChannel();
        v.switchON();
    }
}

