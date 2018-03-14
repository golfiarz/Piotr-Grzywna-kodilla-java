package com.kodilla.goodPatterns.challenges;

public class SellRequestRetriver {
    public SellRequest retrieve() {
        User user = new User("Piotr", "Grzywna");

        Invoice invoice = new Invoice();
        invoice.addItem(new Item(new Product("ProductA", 25), 2.0));
        invoice.addItem(new Item(new Product("ProductB", 10), 1.0));

        return new SellRequest(user, invoice);
    }
}
