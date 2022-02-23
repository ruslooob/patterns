package com.ruslooob.creational.factory_method;

public class ProductB implements Product {
    int value;

    @Override
    public int getValue() {
        return value + 1;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ProductB{" + "value=" + value + '}';
    }

}
