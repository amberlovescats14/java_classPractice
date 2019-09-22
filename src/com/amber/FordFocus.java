package com.amber;

public class FordFocus extends Car {
    public FordFocus(boolean powerSteering) {
        super(powerSteering);
    }

    public FordFocus(boolean powerSteering, boolean powerSteering1) {
        super(powerSteering, powerSteering1);
    }

    public FordFocus(double speed, String whichGear, boolean powerSteering) {
        super(speed, whichGear, powerSteering);
    }

    //This method is overriding the method from the original class but also
    // calling the original method....it will do both!
    @Override
    public void increaseSpeed(){
        System.out.println("Increasing Speed");
        super.increaseSpeed();
    }

    @Override
    public void decreasingSpeed(){
        System.out.println("Decreasing Speed");
        super.decreasingSpeed();
    }
}
