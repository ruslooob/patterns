package com.ruslooob.creational.factory_method;

public class CreatorA implements Creator {

    @Override
    public Product createProduct() {
        return new ProductA();
    }

}
