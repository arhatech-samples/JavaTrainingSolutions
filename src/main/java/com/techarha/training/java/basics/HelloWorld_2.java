package com.techarha.training.java.basics;

import sun.tools.jstat.Literal;

/**
 * @question1: Create a class containing an int and a char that are not initialized, and print their values to verify that Java performs default initialization.
 * @explaination2: Inside the class HelloWorld_2, declare a char and int type instance variables and the method which can print the value of these Instance variables.
 *
 * @author ankit.
 */
public class HelloWorld_2 {

    //TODO Create a class containing an int and a char that are not initialized, and print their values to verify that Java performs default initialization.
    static int testInt;
    static char testChar;
    static LiteralUsage literalUsage;

    public static void main(String[] args) {
        System.out.println("Value of int is: " + testInt + "\n value of char is: " + testChar);


        //TODO Print the Declared ints and floats from LiteralUsage Object.
        LiteralUsage literUsageLocal = new LiteralUsage();
        literUsageLocal.printAll();

        /**** Below call will lead to Null Pointer exception, because class level literalUsage reference is null, or doesn't refer to the object**/
        //literalUsage.printAll();
    }
    //TODO After printining above required fields, print the message "Thank You, its <current-time> milliseconds since January 1, 1970 UTC", where current-time should be replaced with current timestamp, derived using System class's currentTimeMillis field.

}


class LiteralUsage{
 /** Declaring Integers  **/
    byte pInt = 127;
    byte nInt = -128;
    int pIntMax = (int)(2e31)-1;
    int nIntMax = -(int)2e31;

    short pshort = 32767;
    short nshort = -32768;


    long plong = (int)(2e63)-1;
    long nlong = -(long)2e63;

 /** Declaring floats **/
    float y = 1234.00F;
    float y1 = 2e31f;

    double d1 = 123.45;

    public void printAll(){
        System.out.println("output is: " +pInt+ ", "+ nInt+ ", "+ pIntMax+ ", "+nIntMax+ ", "+pshort+ ", "+nshort+ ", "+plong+ ", "+nlong+ ", "+y+ ", "+y1+ ", "+d1);
    }
}
