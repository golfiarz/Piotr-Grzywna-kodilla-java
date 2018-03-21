package com.kodilla.goodPatterns.challenges.selling;


import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.products.Item;
import com.kodilla.goodPatterns.challenges.products.Product;
import com.kodilla.goodPatterns.challenges.sellRequest.SellRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemSellService implements SellService {

    private Map<Product, Integer> products = new HashMap<>();

    public ItemSellService(Map<Product, Integer> products) {
        this.products = products;
    }

    public boolean sell(SellRequest sellRequest) {
        if (sellRequest.getUser() == null) {
            return false;
        }

        if (sellRequest.getInvoice() == null) {
            return false;
        }

        Invoice invoice = sellRequest.getInvoice();
        List<Item> items = invoice.getItems();

        for (Item item : items) {

            Product product = item.getProduct();
            int quantity = item.getQuantity();

            int availableQuantity = products.get(product);

            if (quantity > availableQuantity) {
                return false;
            }
        }

        return true;
    }
}
