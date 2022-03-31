package com.thoughtfocus.bridge;

public class Main {
    public static void main(String[] args) {
        Automobile bike = new Bike(new Produce(),new Assemble());
        bike.manufacture();
        System.out.println();

        Automobile car = new Car(new Produce(),new Assemble());
        car.manufacture();
        System.out.println();


    }
}
