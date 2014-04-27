package com.techarha.training.java.exception;

/**
 * @author ankit.
 */
public class Basics {
    static Shape s;
    public static void main(String[] args){
       try {
           s=new Shape();
           NullPointerException e = new NullPointerException();
           e.initCause(new ArithmeticException());

           throw e;

//           System.out.println("This will be printed before Exception");
//           Person.doTask();
//           System.out.println("I am not printed");



       }catch(NullPointerException e ){
           e.printStackTrace();
       }finally{
           System.out.println("Finalyyyyy");
       }

        System.out.println("This will be printed");

    }
}


class Shape{
    public void draw() throws ShapeException{
        System.out.println("I am shape draw");


    }
}

class Person{
    public static void doTask() throws ShapeException{
        try{
            System.out.println("I am Doing Task");
            String[] arr = new String[1];
            System.out.println(arr[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index");
            throw new ShapeException();
        }

    }
}


class ShapeException extends Exception{
    public ShapeException(){
        super("ShapeException");
    }
}
