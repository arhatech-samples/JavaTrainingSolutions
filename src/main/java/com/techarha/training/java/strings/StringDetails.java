package com.techarha.training.java.strings;

/**
 * @author ankit.
 */
public class StringDetails {
    public static void main(String[] args) {
        MyShape shape = new MyShape();
        String s = "HelloWorld";

        System.out.println();
    }
}

class MyShape{
    private int x = 10;

    public int showX(){
        return x;
    }

    public String toString() {
        return "MyShape: Value of X is ->" +showX();
    }
}