package com.thoughtfocus.creationaldesignpatterns.builder.singleton;

public class App {
    private static App app;

    private App(){

    }
    public static App getApp(){
        if(app == null){
            app = new App();
        }return app;
    }
}
