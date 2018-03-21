package com.kodilla.goodPatterns.challenges.products;

public final class Product {
    private final String productName;
    private final double price;
    private final String producerProduct;

    public Product(final String productName, final double price,
                   final String producerProduct) {
        this.productName = productName;
        this.price = price;
        this.producerProduct = producerProduct;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getProducerProduct() {
        return producerProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }


}
