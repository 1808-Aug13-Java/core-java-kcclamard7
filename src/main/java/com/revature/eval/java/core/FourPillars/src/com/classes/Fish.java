package com.classes;

import com.exception.ErrorToCorrect;

public class Fish extends Animal {

    private String isFoundIn;
    private String breathingMecanism;
   private double swimmingSpeed;

    // calling the base constructor and adding the child constructor
    public Fish(String name, String eyes, int weight, boolean isAlive,
                String isFoundIn, String breathingMecanism) {
        super(name, eyes, weight, isAlive);
        this.isFoundIn = isFoundIn;
        this.breathingMecanism = breathingMecanism;
    }

    // we override the move function to specialize the fish move
    @Override
    public void move() {
        System.out.println("Move by swimming");
    }

    // we generate the error message to throw in case swimming speed is equals 0
    public Fish(int swimmingSpped) throws ErrorToCorrect {

        if( swimmingSpped == 0){
            throw new ErrorToCorrect("Please enter a correct value for weight superior to 0");
        }

    };

    // method to get swimming speed
    public double getSwimmingSpped() {
        return swimmingSpeed;
    }
}
