package com.thoughtfocus.creationaldesignpatterns.builder;

public class Bike {
    private String brand;
    private int cc;
    private double price;
    private int noOfStrokes;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNoOfStrokes(int noOfStrokes) {
        this.noOfStrokes = noOfStrokes;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", cc=" + cc +
                ", price=" + price +
                ", noOfStrokes=" + noOfStrokes +
                '}';
    }
}
