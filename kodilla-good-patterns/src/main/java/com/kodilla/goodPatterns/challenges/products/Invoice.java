package com.kodilla.goodPatterns.challenges.products;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public final class Invoice {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public double getValueToPay() {
        return items.stream()
                .collect(Collectors.summingDouble(Item::getValue));
    }

    public String getItemProduct() {
        return items.stream()
                .map(a -> a.getProduct().getProductName())
                .collect(Collectors.joining(" and ", "<", ">"));

    }

    public List<Item> getProductAvailable(){
        return items.stream()
                .filter(item -> item.getQuantity() < item.getProduct().getQuantityAvailable())
                .collect(Collectors.toList());

    }

}
