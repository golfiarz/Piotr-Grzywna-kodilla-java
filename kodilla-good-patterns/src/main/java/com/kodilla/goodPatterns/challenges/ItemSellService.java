package com.kodilla.goodPatterns.challenges;

public class ItemSellService implements SellService {

    public boolean sell(User user, Invoice invoice) {
        if (user != null && invoice != null) {
            return true;
        } else {
            return false;
        }
    }
}
