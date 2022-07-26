package com.genera;


public class ThredTest extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }


        public static void main (String[]args)
        {
            ThredTest t = new ThredTest();
            t.start();
            int i = 1;

            while (true) {
                System.out.println(i + "world");
            }
        }
    }


