package com.thoughtfocus.builder;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setBrand("Yamaha");
        bike.setCc(150);
        bike.setNoOfStrokes(4);
        System.out.println(bike);
    }
}
