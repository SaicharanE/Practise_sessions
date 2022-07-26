package com.main.test;

 class My extends Thread{
    public void run()
    {
        int i = 1;
        while (true){
            System.out.println(i++);
        }
    }
}
public class Mythred {
    public static void main(String[] args) {
        My m = new My();
        m.start();
    }
}

