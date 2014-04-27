package com.techarha.training.java.controlflow;

import com.techarha.training.java.basics.AccessControl;

/**
 * @author ankit.
 */
public class CheckAccess extends AccessControl{

    protected int myVal = 33;
    public void printMe(){
        System.out.println(helloo+1);
    }

    public static void main(String[] args) {
        CheckAccess check = new CheckAccess();
        check.helloo=43;
        check.printMe();
    }
}
