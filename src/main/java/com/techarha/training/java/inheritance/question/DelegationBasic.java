package com.techarha.training.java.inheritance.question;

/**
 * @question Show the usage of delegation design using Spaceship Control class and a Spaceship class, which provides abstracted
 *           methods and delegate call further to particular methods
 *
 * @author ankit.
 */
public class DelegationBasic {
    public static void main(String[] args) {
        //TODO create a spaceship and use its methods to control it.
    }

}

class Spaceship{
    private SpaceshipControls controls = new SpaceshipControls();

    public void back(int velocity) {
        controls.back(velocity);
    }
    public void down(int velocity) {
        controls.down(velocity);
    }
    public void forward(int velocity) {
        controls.forward(velocity);
    }
    public void left(int velocity) {
        controls.left(velocity);
    }
    public void right(int velocity) {
        controls.right(velocity);
    }
    public void turboBoost() {
        controls.turboBoost();
    }
    public void up(int velocity) {
        controls.up(velocity);
    }
}


class SpaceshipControls{
    void up(int velocity) {
        System.out.println("Velocity is increased");
    }
    void down(int velocity) {
        System.out.println("Velocity is increased");
    }
    void left(int velocity) {
        System.out.println("Turning left");
    }
    void right(int velocity) {
        System.out.println("Turning Right");
    }
    void forward(int velocity) {
        System.out.println("Moving Forward");
    }
    void back(int velocity) {
        System.out.println("Moving Back");
    }
    void turboBoost() {
        System.out.println("Turbo Boosting Begins");
    }
}