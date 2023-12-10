package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductFactory factory = context.getBean(ProductFactory.class);
        Product product = factory.createProduct();

        product.doSomething();
    }
}
