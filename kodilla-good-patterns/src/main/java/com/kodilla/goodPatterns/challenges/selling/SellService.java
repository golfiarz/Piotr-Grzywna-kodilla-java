package com.kodilla.goodPatterns.challenges.selling;

import com.kodilla.goodPatterns.challenges.Food2Door.ProducerProduct;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.users.Producer;
import com.kodilla.goodPatterns.challenges.users.User;

public interface SellService {

    boolean sell(User user, Invoice invoice, Producer producer, ProducerProduct producerProduct);
}
