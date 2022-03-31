package com.thoughtfocus.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Bike basicBike = new BasicBike();
        basicBike.assembleBike();
        System.out.println(".......................");

        Bike luxuryBike = new LuxuryBike(new BasicBike());
        luxuryBike.assembleBike();
        System.out.println("......................");

        Bike sportsBike = new SportsBike(new LuxuryBike(new BasicBike()));
        sportsBike.assembleBike();


    }
}
