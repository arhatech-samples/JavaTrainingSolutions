package com.techarha.training.java.basics;

/**
 *
 * @explaination we created a class HelloWorld using keyword class. Inside class we have defined a method name 'main'
 * with a String array parameter. This method is public, which means its accessible to all other classes. 'Static' is
 * another modifier put on the method which makes this method accessible to other classes, without having to make the
 * object of HelloWorld class. 'Void' mean the method need not return anything.
 *
 * @author ankit.
 *
 */
public class HelloWorld_1 {

    public static void main(String[] args){
        /**
         * @explaination This code uses 'System' class, provided by java.lang package. This class as a public variable out, of type
         * java.io.PrintStream, which has a method print to print to the console.
         */


        System.out.print("This is my first java program");
        System.currentTimeMillis();
    }
}


/**
 * @author ankit
 */
class Identifiers{

/***** Illegal Identifiers ****/
//    int 6var;
//    int *var;
//    int %_var;

    /***** legal Identifiers ****/
    int $_var;
    int _var;
    int var123;

}