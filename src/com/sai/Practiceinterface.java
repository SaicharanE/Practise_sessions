package com.sai;

abstract class Mi{
    abstract void display();
}
public class Practiceinterface {
public void uiths(){
    Mi m = new Mi()
    {
        public void display(){
            System.out.println("HELLO");
        }
    };
    m.display();

}

    public static void main(String[] args) {
Practiceinterface p = new Practiceinterface();
p.uiths();
    }
}
