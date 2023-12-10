package org.example;

public class ConcreteProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("This is concrete product doing something.");
    }
}
