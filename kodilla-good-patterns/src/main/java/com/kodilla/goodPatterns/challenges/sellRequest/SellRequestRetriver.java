package com.kodilla.goodPatterns.challenges.sellRequest;

import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Item;
import com.kodilla.goodPatterns.challenges.products.Product;

import com.kodilla.goodPatterns.challenges.users.User;

public class SellRequestRetriver {
    public SellRequest retrieve() {
        Product product = new Product("A", 2, "Geber");
        Product product1 = new Product("B", 1, "Bobo");

        User user = new User("Piotr", "Grzywna");

        Item item1 = new Item(product, 200);
        Item item2 = new Item(product1, 20);

        Invoice invoice = new Invoice();
        invoice.addItem(item1);
        invoice.addItem(item2);

        return new SellRequest(user, invoice);
    }
}

