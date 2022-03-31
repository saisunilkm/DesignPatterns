package com.thoughtfocus.bridge;

public class Car extends Automobile{
    public Car (WorkShop workShop1,WorkShop workShop2){
        super(workShop1,workShop2);
    }
    @Override
    public void manufacture() {
        System.out.print(" Car is ");
        workShop1.work();
        workShop2.work();

    }
}
