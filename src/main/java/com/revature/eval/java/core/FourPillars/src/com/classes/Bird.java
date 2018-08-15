package com.classes;

public class Bird  extends Animal {

    private String typeOfBeak;
    private String typeOfWings;
    private int flyingAltiture;

    // calling the base constructor
    public Bird(String name, String eyes, int weight, boolean isAlive, String typeOfBeak,
                String typeOfWings, int flyingAltiture) {
        super(name, eyes, weight, isAlive);
        this.typeOfBeak = typeOfBeak;
        this.typeOfWings = typeOfWings;
        this.flyingAltiture = flyingAltiture;
    }


    public String getTypeOfBeak() {
        return typeOfBeak;
    }

    public String getTypeOfWings() {
        return typeOfWings;
    }

    public int getFlyingAltiture() {
        return flyingAltiture;
    }

    // overriding base class method for bird motion
    @Override
    public void move() {
        System.out.println(this.getName() + " Can fly with wings");
    }



}

