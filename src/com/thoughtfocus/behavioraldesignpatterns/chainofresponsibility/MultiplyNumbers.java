package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

public class MultiplyNumbers implements Chain {
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }
    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted() == "mult"){
            System.out.println(request.getNumber1()+ " * " + request.getNumber2()+ " = "+(request.getNumber1()) * request.getNumber2());
        }else{
            nextInChain.calculate(request);
        }

    }
}
