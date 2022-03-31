package com.thoughtfocus.singleton;

public class Main {
    public static void main(String[] args) {
        App app =  App.getApp();
        App app1 = App.getApp();
        App app2 = App.getApp();

    }
}
