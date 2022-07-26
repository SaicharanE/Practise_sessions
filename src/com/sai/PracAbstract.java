package com.sai;

abstract  class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
    double radius;
    public double perimeter(){
    return 2*Math.PI*radius;
    }
    public double area(){
    return Math.PI*radius*radius;
    }
}


class Rectangle extends Shape{
    double length;
    double breadth;
    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
public class PracAbstract {
    public static void main(String[] args) {
        Circle C = new Circle();
        Rectangle r = new Rectangle();
        C.radius = 7;
        r.breadth = 8;
        r.length = 3;
        //C.perimeter();
        System.out.println("Perimter of circle is"+C.perimeter());
        System.out.println("Perimter of area is"+C.area());
        System.out.println("Perimter of Rectangle is" + r.perimeter());
        System.out.println("Perimter of Rectangle is" + r.area());



    }
}
