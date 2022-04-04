package com.thoughtfocus.creationaldesignpatterns.builder.factory;

public class Bike implements Vehical {


    @Override
    public void brands() {
        System.out.println("Royal Enfield");
        System.out.println("Yamaha");
        System.out.println("KTM");
        System.out.println("TVS");
    }

}
