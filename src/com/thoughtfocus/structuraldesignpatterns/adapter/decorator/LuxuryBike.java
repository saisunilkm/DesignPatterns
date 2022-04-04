package com.thoughtfocus.structuraldesignpatterns.adapter.decorator;

public class LuxuryBike extends DecoratorBike {
    public LuxuryBike(Bike bike) {
        super(bike);
    }

    @Override
    public void assembleBike() {
        super.assembleBike();
        System.out.println("Adding features to Luxury Bike");
    }
}
