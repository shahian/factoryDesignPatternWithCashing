package com.shahian.factorydesignpatternwithcashing.concretes;


import com.shahian.factorydesignpatternwithcashing.interfaces.Product;

public class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("Concrete Product A ...");
    }
}
