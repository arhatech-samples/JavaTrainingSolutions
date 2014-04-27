package com.techarha.training.java.controlflow.question;

import java.util.Random;

/**
 * @question1: Write a program that generates 25 random int values. For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.
 *
 *
 * @author ankit.
 */
 class RandomGenerationtrt {

    //TODO write a program to create Random numbers
    static Random ran = new Random();


    public void printHello(){
        System.out.println("Hi Hello");
    }

    public static void main(String[] args) {

        for(int i = 0; i<25; i++) {
            int myFirst = ran.nextInt();
            int mySecond = ran.nextInt();
            System.out.println("Iteration: " + (i+1));
            if(myFirst<mySecond){
                System.out.println("\t"+myFirst + " is less than " + mySecond);
            }else if (myFirst == mySecond){
                System.out.println("\t"+myFirst + " is equal to " + mySecond);
            }else {
                System.out.println("\t"+myFirst + " is greater than " + mySecond);
            }

        }
    }
}
