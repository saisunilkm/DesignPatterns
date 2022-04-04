package com.thoughtfocus.structuraldesignpatterns.bridge;

public class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
