package com.mk.codePractice.designPatterns.singleton;

public class Singleton_05_DoubleCheck {

    private static Singleton_05_DoubleCheck instance;

    private Singleton_05_DoubleCheck(){}

    public static Singleton_05_DoubleCheck getInstance(){
        if (instance == null) {
            synchronized (Singleton_05_DoubleCheck.class) {
                if (instance == null) {
                    instance = new Singleton_05_DoubleCheck();
                }
            }
        }
        return instance;
    }

}
