package com.mk.codePractice.designPatterns.singleton;

import java.io.ObjectStreamException;

public class Singleton_08_Serialized {

    private static final long serialVersionUID = -7604766932017737115L;

    private Singleton_08_Serialized(){}

    private static class SingletonHelper {
        private static final Singleton_08_Serialized instance = new Singleton_08_Serialized();
    }

    public static Singleton_08_Serialized getInstance() {
        return SingletonHelper.instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

}
