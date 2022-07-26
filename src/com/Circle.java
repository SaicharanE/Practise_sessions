package com;

class Circle1 {
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return Math.PI*radius*2;
    }
}
class Cylinder extends Circle1{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Circle{
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        //Circle1 obj1 = new Circle1();
        obj.height = 7;
        obj.radius = 7;
        System.out.println(obj.area());
        System.out.println(obj.volume());

    }
}

