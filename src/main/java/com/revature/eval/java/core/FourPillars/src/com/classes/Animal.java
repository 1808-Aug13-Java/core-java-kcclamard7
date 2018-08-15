
// main base class from with other classes inherit
package com.classes;

public abstract class Animal {


    private String name;
    private String eyes;

    public Animal() {
    }

    private int weight;
    private boolean isAlive;

   public Animal( String name, String eyes, int weight, boolean isAlive){
       this.eyes = eyes;
       this.name = name;
       this.weight = weight;
       this.isAlive = isAlive;
   }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getEyes() {
        return eyes;
    }

    public boolean GetisAlive(){
       return isAlive;
    }

        // method to overide in oder to specify each animal motion
    public void move(){

        System.out.println(" can move");
    }
}
