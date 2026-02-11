package com.mk.codePractice.designPatterns.singleton;

public class Singleton_03_lazy {

    private static Singleton_03_lazy instance;

    private Singleton_03_lazy(){}

    public static Singleton_03_lazy getInstance(){
        if(instance == null)
            instance = new Singleton_03_lazy();
        return instance;
    }

}
