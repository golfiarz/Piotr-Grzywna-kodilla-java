package com.kodilla.goodPatterns.challenges.sellRequest;


import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Item;
import com.kodilla.goodPatterns.challenges.products.Product;

import com.kodilla.goodPatterns.challenges.users.User;

import java.util.*;

public class SellRequestRetriver {
    public SellRequest retrieve() {
        Product product = new Product("A", 2, "Geber", 100);
        Product product1 = new Product("B", 1, "Bobo", 100);

        User user = new User("Piotr", "Grzywna");

        Item item = new Item(product, 200);
        Item item1 = new Item(product1, 20);

        Invoice invoice = new Invoice();
        invoice.addItem(item);
        invoice.addItem(item);

        return new SellRequest(user, invoice);
    }
}

