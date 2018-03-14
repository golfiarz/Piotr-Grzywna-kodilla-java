package com.kodilla.goodPatterns.challenges.products;

public final class Item {
    private final Product product;
    private final double quantity;

    public Item(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getPrice() * quantity;
    }

    

}
