package com.thoughtfocus.structuraldesignpatterns.adapter.decorator;

public class BasicBike implements Bike {
    @Override
    public void assembleBike() {
        System.out.println("Basic Bike...");
    }
}
