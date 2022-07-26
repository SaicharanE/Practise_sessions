package com.main.test;
class Soper{
    public void meth1(){
        System.out.println("soper meth1");
    }
    public void meth2(){
        System.out.println("soper meth2");
    }
}
class Subb extends Soper{
    @Override
    public void meth2(){
        System.out.println("submeth2");
    }
    public void meth3(){
        System.out.println("submeth3");
    }
}
public class Dynamicmethoddispatch {

    public static void main(String[] args) {
        Soper s = new Subb();
        s.meth1();
        s.meth2();
        //s.meth3();85275 96766
    }
}
