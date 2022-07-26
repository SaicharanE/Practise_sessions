package com.main.test;

import com.sun.tools.javac.Main;

class Super{
    public void display(){
        System.out.println("Super class");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class display");
    }
}
public class Pratmethodoverride {
    public static void main(String[] args) {
        Sub sup = new Sub();
        //sup.display();
    }
}
