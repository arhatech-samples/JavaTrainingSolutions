package com.techarha.training.java.basics;

import com.techarha.training.java.Interface.ShapePrinter;

/**
 * @author ankit.
 */
public class AccessControl {
    protected int helloo=31;
    final int x;


    public AccessControl(){
        {
            x=helloo+3;
        }
    }

    public void printMe(){
        System.out.println(helloo+"");

    }

    public static void main(String[] args) {
        AccessControl acces = new AccessControl();
        acces.printMe();

        ShapePrinter printer = new ShapePrinter();

//        printer.y = 32;
    }
}
