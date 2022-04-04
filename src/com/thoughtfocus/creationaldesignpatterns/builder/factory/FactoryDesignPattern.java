package com.thoughtfocus.creationaldesignpatterns.builder.factory;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        VehicalFactory vehicalFactory = new VehicalFactory();
        Vehical vehical = vehicalFactory.getResult("Car");
        vehical.brands();

    }
}
