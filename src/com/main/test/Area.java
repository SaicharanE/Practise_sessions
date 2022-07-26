package com.main.test;

import com.sun.tools.javac.Main;

import javax.management.remote.SubjectDelegationPermission;

class Rect{
    int length;
    int breadth;
    Rect(){
        length = breadth = 1;
    }
    Rect(int l, int b){
        length = l;
        breadth = b;
    }

}

class Cuboi extends Rect
{
  int height;
  Cuboi(){
      height = 1;
  }
    Cuboi(int h){
      height = h;
    }
    Cuboi(int l, int b ,int h){
      super(l,b);
      height = h;


    }
    int volume(){
      return length*breadth*height;
    }

}
public class Area {
    public static void main(String[] args) {
        Cuboi c = new Cuboi(5,3,10);
        System.out.println(c.volume());

    }
}
