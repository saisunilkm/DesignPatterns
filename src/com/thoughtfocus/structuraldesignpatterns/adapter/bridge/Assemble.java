package com.thoughtfocus.structuraldesignpatterns.adapter.bridge;

public class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
