package com.shahian.factorydesignpatternwithcashing.controller;

import com.shahian.factorydesignpatternwithcashing.factory.ProductFactory;
import com.shahian.factorydesignpatternwithcashing.interfaces.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class TestController {
private final ProductFactory productFactory;

    public TestController(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @GetMapping("/v1/test-factory-pattern-with-cashing")
    public ResponseEntity<?> getProduct() {
        Product productA = productFactory.getProduct("A");
        Product productB = productFactory.getProduct("B");
        Objects.requireNonNull(productA, "Product A cannot be null").operation();
        Objects.requireNonNull(productB, "Product B cannot be null").operation();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
