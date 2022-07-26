package com.main.test;


class Parent {
    Parent() {
        System.out.println("Non param of parent");
    }

    Parent(int x) {
        System.out.println("Parent parameter");
    }
}
 class Child extends Parent{
        Child(){

            System.out.println("Non param from Child ");
        }
        Child(int y){
            System.out.println(" Child parameter");
        }
        Child(int x ,int y){
            super(x);
            System.out.println("2 param of child");
        }
 }

public class Actual
{
    public static void main(String[] args) {
        Child c= new Child();

    }
}
