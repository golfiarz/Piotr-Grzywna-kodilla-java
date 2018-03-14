package com.kodilla.goodPatterns.challenges.selling;

import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.users.User;

public class ItemSellService implements SellService {

    public boolean sell(User user, Invoice invoice) {
        if (user != null && invoice != null) {
            return true;
        } else {
            return false;
        }
    }
}
