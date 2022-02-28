package com.ruslooob.other.null_object;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Animal dog;
        for (int i = 0; i < 100; i++) {

            if (random.nextInt() % 2 == 0) {
                dog = new Dog();
            } else {
                dog = new NullAnimal();
            }

            // это может быть полезно, если nullAnimal мог прийти откуда-то из другого места
            // и чтобы не проверять его на null, можно просто вызывать его метод,
            // не переживая, что вылетит NPE
            dog.makeSound();
        }

    }
}
