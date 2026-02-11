package com.mk.codePractice.designPatterns.singleton;

public class Singleton_02_StaticBlock {

    private static final Singleton_02_StaticBlock instance;

    private Singleton_02_StaticBlock(){}

    static {
        try {
            instance = new Singleton_02_StaticBlock();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Singleton_02_StaticBlock getInstance(){
        return instance;
    }

}
