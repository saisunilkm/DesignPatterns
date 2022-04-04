package com.thoughtfocus.structuraldesignpatterns.adapter.composite;

public class Leaf implements Component {
    String name;
    double price;

    public Leaf(String name,double price) {
        super();
        this.name = name;
        this.price = price;
    }
    @Override
    public void price() {
        System.out.println(name + " : "+ price);

    }
}
