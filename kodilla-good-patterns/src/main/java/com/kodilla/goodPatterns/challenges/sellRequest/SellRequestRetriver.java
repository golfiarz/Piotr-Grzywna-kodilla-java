package com.kodilla.goodPatterns.challenges.sellRequest;

import com.kodilla.goodPatterns.challenges.Food2Door.ProducerProduct;
import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Item;
import com.kodilla.goodPatterns.challenges.products.Product;
import com.kodilla.goodPatterns.challenges.users.Producer;
import com.kodilla.goodPatterns.challenges.users.User;

import java.util.*;

public class SellRequestRetriver {
    public SellRequest retrieve() {
        User user = new User("Piotr", "Grzywna");
        Producer producer = new Producer("Geber");

        ProducerProduct producerProduct = new ProducerProduct();
        producerProduct.addProductAvailable(new ProductAvailable(new Product("ProductA", 25), 100));
        producerProduct.addProductAvailable(new ProductAvailable(new Product("ProductB", 10), 100));

        Invoice invoice = new Invoice();
        invoice.addItem(new Item(new Product("ProductA", 25), 200));
        invoice.addItem(new Item(new Product("ProductB", 10), 1.0));

        return new SellRequest(user, invoice, producer, producerProduct);
    }
}
