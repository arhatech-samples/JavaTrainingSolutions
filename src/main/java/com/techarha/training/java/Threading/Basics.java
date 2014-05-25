package com.techarha.training.java.threading;

/**
 * @author ankit.
 */
public class Basics {
    public static void main(String[] args) {
        Thread t = new MySample();
        t.start();

        Runnable runner = new MyFriend();
        Thread t1 = new Thread(runner);
        t1.start();
    }
}


class MySample extends Thread{

    @Override
    public void run(){
        for(int i=0; i<=11;i++) {
            System.out.println("This is MySample Thread " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyFriend implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=11;i++) {
            System.out.println("This is MyFriend Runnable " + i);
            try {
                Thread.sleep(850);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}