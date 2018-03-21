package com.kodilla.goodPatterns.challenges.sellRequest;


import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Product;

import com.kodilla.goodPatterns.challenges.users.User;

import java.util.List;

public class SellRequest {

    public User user;
    public Invoice invoice;
    /**
    public Producer producer;
    public ProducerProduct producerProduct;
     */

    public SellRequest(User user, Invoice invoice) {
        this.user = user;
        this.invoice = invoice;

    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }

}
