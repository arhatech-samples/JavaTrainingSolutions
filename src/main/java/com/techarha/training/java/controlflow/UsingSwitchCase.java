package com.techarha.training.java.controlflow;

/**
 * @question complete the code below to handle switch cases below, and should return the successful case Literal value as a String.
 *
 * @author ankit.
 */
public class UsingSwitchCase {

    private int testInt;

    private byte testByte;

    private short testShort;

    private char testChar;

    private TestEnum testEnum;


    //TODO using int in switch cases.
    public String switchInt(int testInt){



        return "";
    }

    //TODO using byte in switch case.
    public String switchByte(byte testByte){

        String internal = "";

        switch(testByte){
            case 1:
                internal = "One Byte";

                break;
            case 2:

            case 3:


            default:

        }

        return "";
    }

    //TODO using short in switch case.
    public String switchShort(short testShort) {

        return "";
    }

    //TODO using chars in switch case.
    public String switchChar(char testChar){

        return "";
    }

    //TODO using Enums in switch case and print the value encountered to console.
    public String switchEnum(TestEnum testEnum){

        switch(testEnum){
            case First:
            case Second:

            default:
        }
        return "";
    }

}


/************** writing Enums in java *********/

enum TestEnum{
    First, Second, Third, Fourth;
}