package com.main.test;
class Rcar{
    public void start(){
        System.out.println("Start the car");
    }
    public  void changeGear(){
        System.out.println("Change the gear");
    }
    public void accelerate(){
        System.out.println("Accelerate the car");
    }

}
class Luxarycar extends Rcar{
    @Override
    public void start() {
        System.out.println("Start the car");
    }
    @Override
    public void changeGear() {
        System.out.println("Automatic gear");
    }
    @Override
    public void accelerate() {
        System.out.println("Accelerate the car");
    }
    public void openroof(){
        System.out.println("Roof");
    }
}
public class Car {
    public static void main(String[] args) {
        Luxarycar r = new Luxarycar();
        r.accelerate();
        r.changeGear();
        r.start();
        r.openroof();

    }
}
