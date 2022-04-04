package com.thoughtfocus.structuraldesignpatterns.proxy;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("sunil.org");
            internet.connectTo("abc.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
