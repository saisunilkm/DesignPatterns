package com.thoughtfocus.factory;

public class Car implements Vehical{

    @Override
    public void brands() {
        System.out.println("Hyundai");
        System.out.println("Audi");
        System.out.println("Kia");
        System.out.println("BMW");
        System.out.println("Jaguar");
        System.out.println("Ferrari");
    }

}
