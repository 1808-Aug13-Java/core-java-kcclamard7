package com.classes;

public class Mamal extends Animal{

    private String color;
    private boolean hasTails;

    // calling the base constructor and adding the child constructor
    public Mamal(String name, String eyes, int weight, boolean isAlive, String color, boolean hasTails) {
        super(name, eyes, weight, isAlive);
        this.color = color;
        this.hasTails = hasTails;
    }

    public String getColor(){

        return color;
    }

    public boolean gethasTails(){

        return hasTails;
    }
// overriding the base constructor
    @Override
    public  void move(){

        System.out.println(this.getName()+ " can walk to move");
    }

}
