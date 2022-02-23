package com.ruslooob.creational.factory_method;

public class ProductA implements Product {

    private int value;

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "ProductA{" + "value=" + value + '}';
    }

}
