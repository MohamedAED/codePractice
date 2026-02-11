package com.mk.codePractice.designPatterns.singleton;

public class Singleton_04_ThreadSafe {

    private static Singleton_04_ThreadSafe instance;

    private Singleton_04_ThreadSafe(){}

    public static synchronized Singleton_04_ThreadSafe getInstance(){
        if(instance == null)
            instance = new Singleton_04_ThreadSafe();
        return instance;
    }

}
