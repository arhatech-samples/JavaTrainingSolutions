package com.techarha.training.java.Interface;


/**
 * @author ankit.
 */
public class ShapePrinter extends Rectangle{


    public static void main(String[] args) {

        Square s = new Square();

        s.y=10;

    }
}

class Circle implements Shape{
   public void draw(){
       System.out.println("Circle" + myValue);
    }

    public void fillColor() {
        System.out.println("Fill Circle" + color);
    }


    public void convert() {
        System.out.println("Convert Circle");
    }

    public void size(){
        System.out.println("Size");
    }
}

class Rectangle implements Shape{
    protected int y =10;

    public static void myTest(){
        System.out.println("Test");
    }

    public void draw(){
        System.out.println("Rectangle");
    }

    public void fillColor() {
        System.out.println("Fill Rectangle" + color);
    }


    public void convert() {
        System.out.println("Convert Rectangle");
    }
    public void size(){
        System.out.println("Size");
    }
}

class Square extends Rectangle{

}