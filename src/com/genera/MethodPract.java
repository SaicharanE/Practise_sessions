package com.genera;

import java.util.Scanner;

public class MethodPract extends Actual {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first digit: ");
    int x = sc.nextInt();
    System.out.println("Enter second digit: ");
    int y = sc.nextInt();
    Actual U = new Actual();
    int i =   U.oven(x,y);
    System.out.println("The sum of two numbers you entered is "+i);
    }
}

