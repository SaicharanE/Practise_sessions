package com.sai;

import java.util.Scanner;

public class Practiceexception {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
          System.out.println(e);
        }
            System.out.println("programme completed");

    }
}
