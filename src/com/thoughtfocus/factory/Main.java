package com.thoughtfocus.factory;

public class Main {
    public static void main(String[] args) {
        VehicalFactory vehicalFactory = new VehicalFactory();
        Vehical vehical = vehicalFactory.getResult("Car");
        vehical.brands();

    }
}
