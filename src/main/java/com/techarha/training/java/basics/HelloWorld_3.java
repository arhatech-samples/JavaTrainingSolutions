package com.techarha.training.java.basics;

/**
 * @question: Write a program that demonstrates that, no matter how many objects you create of a particular class, there is only one instance of a particular static field in that class.
 * @explaination: The class SampleObjectfactory has a createNew() method to create new instances of type SampleObjectFactory.
 * Now there should be a static field in the SampleObjectFactory to keep count of number of instances created for current execution, which we will access through method getObjectCount()
 * @author ankit.
 */
public class HelloWorld_3 {
    public static void main(String[] args) {
        SampleObjectFactory object1 = SampleObjectFactory.createNew();
        SampleObjectFactory object2 = SampleObjectFactory.createNew();

        System.out.println(object1.getObjectCount());   // Output should be 2, since 2 objects created.
        System.out.println(object2.getObjectCount());

        SampleObjectFactory object3 = SampleObjectFactory.createNew();
        System.out.println(object1.getObjectCount());

    }

}

class SampleObjectFactory{
    //TODO create a static 'objectCount' here to count the total objects created.
    static int objectCount;

    private SampleObjectFactory(){
        //TODO increment the count to represent total number of object created.
        objectCount++;
    }

    public static SampleObjectFactory createNew(){
        return new SampleObjectFactory();
    }

    public int getObjectCount(){
        //TODO complete the method to return the total objectCount;

        return objectCount;
    }
}
