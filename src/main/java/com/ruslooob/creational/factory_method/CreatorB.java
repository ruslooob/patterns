package com.ruslooob.creational.factory_method;

public class CreatorB implements Creator {

    @Override
    public Product createProduct() {
       return new ProductB();
    }

}
