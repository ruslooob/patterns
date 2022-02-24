package com.ruslooob.creational.singleton;

public class PureSingleton {
    private static PureSingleton instance;
    // other useful fields

    private PureSingleton() {

    }

    public static PureSingleton getInstance() {
        if (instance == null) {
            instance = new PureSingleton();
        }
        return instance;
    }

}
