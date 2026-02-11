package com.mk.codePractice.designPatterns.singleton;

public class Singleton_01_Eager {


    private static final Singleton_01_Eager instance = new Singleton_01_Eager();

    private Singleton_01_Eager(){}

    public static Singleton_01_Eager getInstance(){
        return instance;
    }

}
