package com.mk.codePractice.designPatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        Singleton_01_Eager instanceOne = Singleton_01_Eager.getInstance();
        Singleton_01_Eager instanceTwo = null;
        try {
            Constructor[] constructors = Singleton_01_Eager.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Singleton_01_Eager) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
