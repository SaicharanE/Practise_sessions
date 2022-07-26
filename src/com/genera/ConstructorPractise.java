package com.genera;

public class ConstructorPractise {
    public static void main(String[] args) {
    Oven o1 = new Oven("SAICHARAN",2);
    Oven o2 = new Oven("charan",2);

    o1.info();
    o2.info();
    }
}
class Oven{
    String Sname ;
    int a ;

    Oven (String S, int A){
       this.Sname =  S;
       this.a= A;
    }
    Void info(){
       System.out.println(Sname);
       System.out.println(a);
        return null;
    }
}
