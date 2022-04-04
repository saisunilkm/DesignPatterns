package com.thoughtfocus.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new MultNumbers();
        Chain chainCal3 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);

        Numbers request = new Numbers(10,2,"div");

        chainCal1.calculate(request);

    }
}
