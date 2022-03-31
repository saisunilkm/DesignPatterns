package com.thoughtfocus.proxy;

public class Main {
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
