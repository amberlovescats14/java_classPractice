package com.amber;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("REST");
    }
    private void swim(){
        System.out.println("Swimming");
        move();  // U DONT HAVE TO SAY super.move()
    }
}
