package com.ruslooob.creational.factory_method;

public class Main {

    public static void main(String[] args) {
        Creator creator = new CreatorA();
        Product product = creator.createProduct();
        System.out.println(product);

        Creator anotherCreator = new CreatorB();
        Product anotherProduct = creator.createProduct();
        System.out.println(anotherProduct);

        System.out.println(product.getValue());
        product.setValue(20);
        System.out.println(product.getValue());

        System.out.println(anotherProduct.getValue());
        anotherProduct.setValue(25);
        System.out.println(anotherProduct.getValue());
    }
}
