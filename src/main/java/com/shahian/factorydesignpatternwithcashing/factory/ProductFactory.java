package com.shahian.factorydesignpatternwithcashing.factory;



import com.shahian.factorydesignpatternwithcashing.concretes.ConcreteProductA;
import com.shahian.factorydesignpatternwithcashing.concretes.ConcreteProductB;
import com.shahian.factorydesignpatternwithcashing.interfaces.Product;

import java.util.HashMap;

public class ProductFactory {
    public static final HashMap<String, Product> cash = new HashMap<>();

    public static Product getProduct(String type) {
        if (cash.containsKey(type)) {
            System.out.println("Returning cashed object for type: " + type);
            return cash.get(type);
        } else {
            switch (type) {
                case "A" -> {
                    Product productA = new ConcreteProductA();
                    cash.put(type, productA);
                    return productA;
                }
                case "B" -> {
                    Product productB = new ConcreteProductB();
                    cash.put(type, productB);
                    return productB;
                }
                default -> {
                    return null;
                }
            }
        }
    }
}
