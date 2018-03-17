package com.kodilla.goodPatterns.challenges.sellRequest;

import com.kodilla.goodPatterns.challenges.Food2Door.ProducerProduct;
import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Product;
import com.kodilla.goodPatterns.challenges.users.Producer;
import com.kodilla.goodPatterns.challenges.users.User;

import java.util.List;

public class SellRequest {

    public User user;
    public Invoice invoice;
    public Producer producer;
    public ProducerProduct producerProduct;

    public SellRequest(User user, Invoice invoice, Producer producer, ProducerProduct producerProduct) {
        this.user = user;
        this.invoice = invoice;
        this.producer = producer;
        this.producerProduct = producerProduct;

    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Producer getProducer() {
        return producer;
    }

    public ProducerProduct getProducerProduct() {
        return producerProduct;
    }
}
