package com.mk.codePractice.designPatterns.singleton;

public class Singleton_06_BillPugh {

    private Singleton_06_BillPugh(){}

    private static class Singleton_06_BillPughHolder{
        private static final Singleton_06_BillPugh INSTANCE = new Singleton_06_BillPugh();
    }

    public static Singleton_06_BillPugh getInstance(){
        return Singleton_06_BillPughHolder.INSTANCE;
    }

}
