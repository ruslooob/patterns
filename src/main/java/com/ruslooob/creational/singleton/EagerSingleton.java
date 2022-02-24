package com.ruslooob.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    // other useful fields

    public static EagerSingleton getInstance() {
        return instance;
    }

}
