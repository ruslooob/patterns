package com.ruslooob.creational.singleton;

public class MultithreadingSingleton {
    private static MultithreadingSingleton instance;

    private MultithreadingSingleton() {

    }

    public synchronized static MultithreadingSingleton getInstance() {
        if (instance == null) {
            instance = new MultithreadingSingleton();
        }
        return instance;
    }


}
