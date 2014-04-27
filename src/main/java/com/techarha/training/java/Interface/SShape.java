package com.techarha.training.java.Interface;

/**
 * @author ankit.
 */

class Wrapper{
    int mnp;

    public Wrapper(int x){
        System.out.println("This is a constructor" + x);
    }

    public void printer(){
        System.out.println("I am a printer");
    }
}


public class SShape {
int x = 3;
    Wrapper wrap = new Wrapper(x){
        public void printer(){
            System.out.println("I am Inherited Printer");
        }

        public void Helper(){
            System.out.println("i am helper");
        }

    };


    public SShape(){

//        wrap.Helper();

    }


    public static void main(String[] args) {
        SShape s = new SShape();
        s.wrap.printer();
    }



    public void draw(){
        System.out.println("This is draw");
//        c.fillColor();

    }

    public class sColored implements Colored{
        public void draw1(){
            System.out.println("This is inner draw");

        }
        public void fillColor(){
            System.out.println("This is InnerClass FillColor");
            draw();
        }
    }



    public Colored getColored(){
        sColored sColor = new sColored();

        return sColor;
    }

    public _3D get3D(){

        class s_3D implements _3D{
            public void convert(){
                System.out.println("This is InnerClass Converter to 3D");
            }
        }

        return new s_3D();
    }
























}
