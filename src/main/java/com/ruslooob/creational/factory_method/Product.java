package com.ruslooob.creational.factory_method;

public interface Product {
    // интерфейс, который позволяет нам получить и установить нужные данные
    // таких методов может быть несколько, главное, чтобы они выполняли интерфейс
    // необходимого продукта
    int getValue();
    void setValue(int value);
    // фабричный метод, который будет переопределять наследник
//    Product of(int value);
}
