package com.thoughtfocus.structuraldesignpatterns.adapter.bridge;

public class Produce implements WorkShop {
    @Override
    public void work() {
        System.out.print("Produced and ");
    }
}
