package com.kodilla.goodPatterns.challenges.Food2Door;

import com.kodilla.goodPatterns.challenges.products.Product;

public final class ProductAvailable {
    private final Product product;
    private final double quantityAvailable;

    public ProductAvailable(Product product, double quantityAvailable) {
        this.product = product;
        this.quantityAvailable = quantityAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantityAvailable() {
        return quantityAvailable;
    }
}
