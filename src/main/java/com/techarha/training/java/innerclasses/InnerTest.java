package com.techarha.training.java.innerclasses;

/**
 * @author ankit.
 */
public class InnerTest {

    public static void main(String[] args) {
        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        Outer.Inner.Innerw innerInner = myInner.new Innerw();

    }

}

class Outer{
    private int x = 5;

    public Outer(){
        System.out.println("Outer Class Created");
    }

    class Inner{
        private int y;

       {
           y=10;
           System.out.println("This is init block");
        }

        public Inner(){
            System.out.println("Inner Class reference" + this);
            System.out.println("Outer Class reference" + Outer.this);
        }

        class Innerw{
            private int y = 10;

            public Innerw(){
                System.out.println("InnerW's Outer Refernce: " + Outer.this);
                System.out.println("InnerW's Inner Refernce: " + Inner.this);
                System.out.println("InnerW's Inner Refernce: " + Outer.Inner.this);
            }
        }
    }

}
