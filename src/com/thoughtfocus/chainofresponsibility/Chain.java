package com.thoughtfocus.chainofresponsibility;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);

}
