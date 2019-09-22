package com.amber;

public class Main {

    public static void main(String[] args) {
        var amber = new Accounting();
        System.out.println(amber.getBalance());

        var anon = new VIPcustomer();
        System.out.println(anon.getName());

        var pumpkin = new Dog("pumpkin", 1, 1, 1, 60, 1 , 1, 1, 1, "long");
        pumpkin.eat();



        //double extend, vehicle => car => fordFocus
        var myCar = new FordFocus(true);
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        System.out.println(myCar.turnLeft());
        myCar.decreasingSpeed();
    }

}
