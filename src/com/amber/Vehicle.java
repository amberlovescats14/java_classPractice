package com.amber;

public class Vehicle {
    private double speed;
    private String whichGear;


    public Vehicle(){
        this(0,"park");
    }

    public Vehicle(boolean powerSteering){
        this(0, "park");
    }

    public Vehicle(double speed, String whichGear) {
        this.speed = speed;
        this.whichGear = whichGear;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getWhichGear() {
        return whichGear;
    }

    public void setWhichGear(String whichGear) {
        this.whichGear = whichGear;
    }
    public void increaseSpeed(){
        speed++;
        System.out.println(speed);
    }
    public void decreasingSpeed(){
        speed--;
        System.out.println(speed);
    }

}
