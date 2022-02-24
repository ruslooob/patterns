package com.ruslooob.creational.singleton;

public class ImprovedMultithreadingSingleton {

    private static volatile ImprovedMultithreadingSingleton instance;

    private ImprovedMultithreadingSingleton() {}

    public static ImprovedMultithreadingSingleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new ImprovedMultithreadingSingleton();
                }
            }
        }
        return instance;
    }
}
