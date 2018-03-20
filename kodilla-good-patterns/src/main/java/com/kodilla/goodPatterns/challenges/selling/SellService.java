package com.kodilla.goodPatterns.challenges.selling;


import com.kodilla.goodPatterns.challenges.products.Invoice;

import com.kodilla.goodPatterns.challenges.users.User;

public interface SellService {

    boolean sell(User user, Invoice invoice);
}
