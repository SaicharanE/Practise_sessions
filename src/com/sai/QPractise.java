package com.sai;

public class QPractise {
    String name;
    QPractise(String n){
        name = n;
    }
    public  void  neth(){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        QPractise S = new QPractise("SAI");
        S.neth();

    }
}
