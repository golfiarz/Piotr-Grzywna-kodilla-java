package com.kodilla.goodPatterns.challenges.selling;


import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Item;

import com.kodilla.goodPatterns.challenges.sellRequest.SellDto;
import com.kodilla.goodPatterns.challenges.sellRequest.SellRequest;
import com.kodilla.goodPatterns.challenges.users.User;

import java.util.List;

public class ItemSellService implements SellService {

    public boolean sell(User user, Invoice invoice) {

        if (user == null || invoice == null || invoice.getProductAvailable()==null) {
            return false;
        } else {
            return true;
        }
    }
}
