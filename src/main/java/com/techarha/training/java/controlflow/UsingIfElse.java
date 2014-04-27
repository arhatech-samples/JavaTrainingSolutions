package com.techarha.training.java.controlflow;

/**
 * @question1: We will learn the usage of If-Else blocks in this training class.
 * @explaination: We are comparing int below
 * @author ankit.
 */
public class UsingIfElse{
    static int myValue;
    static int reqValue;


    public static void main(String[] args) {
        UsingIfElse us = new UsingIfElse();
        if(myValue<reqValue){
            System.out.println("MyValue is smaller than the ReqValue.");
        }else if(myValue==reqValue){
            System.out.println("MyValue is same as the ReqValue");
        }else{
            System.out.println("MyValue is greater than the ReqValue");
        }
    }
}
