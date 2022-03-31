package com.thoughtfocus.bridge;

public class Bike extends Automobile{
    public Bike (WorkShop workShop1, WorkShop workShop2){
        super(workShop1,workShop2);
    }
    @Override
    public void manufacture() {
        System.out.print("Bike is ");
        workShop1.work();
        workShop2.work();

    }
}
