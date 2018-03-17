package com.kodilla.goodPatterns.challenges.selling;

import com.kodilla.goodPatterns.challenges.Food2Door.ProducerProduct;
import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Item;
import com.kodilla.goodPatterns.challenges.users.Producer;
import com.kodilla.goodPatterns.challenges.users.User;

import java.util.List;

public class ItemSellService implements SellService {

    public boolean sell(User user, Invoice invoice, Producer producer, ProducerProduct producerProduct) {
        if (user != null || invoice != null || invoice.getQuantity() >= producerProduct.getQuantity()) {
            return true;
        } else {
            return false;
        }
    }
}
