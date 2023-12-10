package org.example;

public class ConcreteProductFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
