package com.amber;

public class Car extends Vehicle {
    private boolean powerSteering;

    public Car(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public Car(boolean powerSteering, boolean powerSteering1) {
        super(powerSteering);
        this.powerSteering = powerSteering1;
    }

    public Car(double speed, String whichGear, boolean powerSteering) {
        super(speed, whichGear);
        this.powerSteering = powerSteering;
    }

    public String turnRight(){
        if(powerSteering) return "Turning Right";
        else return "Power Steering not available";
    }
    public String turnLeft(){
        if(powerSteering) return "Turning Left";
        else return "Power Steering not available";
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }
    public boolean getPowerSteering(){
        return powerSteering;
    }

}
