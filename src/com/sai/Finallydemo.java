package com.sai;

public class Finallydemo {
    static void meth1() throws Exception {
        try{
            throw new Exception();
        }//catch (ArithmeticException e){

        //}
        finally {
            System.out.println("Finally block");
        }
    }

    public static void main(String[] args) {

    }
}
