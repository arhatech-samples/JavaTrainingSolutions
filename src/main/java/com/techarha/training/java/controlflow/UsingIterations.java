package com.techarha.training.java.controlflow;

/**
 * @question1: This class covers the Basics about using loops. The code sample below prints values from 1-100 using different loops constructs.
 *
 * @author ankit.
 */
public class UsingIterations {

    public static void main(String[] args) {
        //TODO call different methods to print the loop outputs

    }

    private void usingWhileLoop(){

        System.out.println("************** Using While Loop ***************");

        //Initialization
        int i=1;

        //Iteration
        while(i<=100){
            System.out.printf(i+" ");
            //Increment
            i++;
        }
        System.out.println("");
        System.out.println("********************END**********************");

        return;
    }

    private void usingDoWhileLoop(){
        System.out.println("************** Using do-While Loop ***************");

        //Initialization
        int i = 0;

        do{
            //Increment
            i++;
            System.out.print(i + " ");
        //Iteration
        }while(i<=100);
        System.out.println("");
        System.out.println("********************END**********************");
    }

    private void usingForLoop(){
        System.out.println("************** Using For Loop ***************");

        //initialization; iterations; increment
        for (int i=1; i<=100; i++) {
            System.out.printf(i + " ");
        }
        System.out.println("");
        System.out.println("********************END**********************");
    }


    private String usingEnhancedForLoop(){
        System.out.println("************** Using Enhanced-For Loop ***************");

        int[] intArr = new int[100];

        //initialization; iterations; increment
        for (int i=0; i<100; i++) {
            intArr[i] = i+1;
        }

        //Using the enhanced for loop to print the ints in array
        for(int current: intArr){
            System.out.printf(current + " ");
        }
        System.out.println("");
        System.out.println("********************END**********************");

        return "Done!!";

    }

}
