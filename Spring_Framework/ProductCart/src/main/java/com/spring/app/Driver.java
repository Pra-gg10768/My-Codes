package com.spring.app;

import com.spring.app.Cart;
import com.spring.app.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cart cart = (Cart) context.getBean("cart");

        double totalPrice = 0.0;
        for (Product product : cart.getProductList()) {
            totalPrice += product.getPrice();
        }

        System.out.println("Total Price Rs: " + totalPrice);
    }
}
