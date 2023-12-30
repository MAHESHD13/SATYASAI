package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");

        // Retrieve the Product bean from the Spring container
        Product product = (Product) context.getBean("productBean");
        product.printProductDetails();
      

    }
}

