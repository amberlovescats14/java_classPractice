package com.amber;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
               String coat) {
        //this calls the constructor from the extended class
        // u can also place default values in the super
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        // it will do the eat in the extended class
        super.eat();
        // then run this
        System.out.println("Just Kidding");
    }
}
