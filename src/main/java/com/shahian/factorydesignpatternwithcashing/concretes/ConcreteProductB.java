package com.shahian.factorydesignpatternwithcashing.concretes;


import com.shahian.factorydesignpatternwithcashing.interfaces.Product;

public class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("Concrete Product B ...");

    }
}
