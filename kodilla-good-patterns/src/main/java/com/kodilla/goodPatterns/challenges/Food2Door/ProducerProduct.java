package com.kodilla.goodPatterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public final class ProducerProduct {
    private final List<ProductAvailable> productAvailables = new ArrayList<>();

    public void addProductAvailable(ProductAvailable productAvailable){
        productAvailables.add(productAvailable);
    }

    public boolean removeProductAvailable(ProductAvailable productAvailable){
        return productAvailables.remove(productAvailable);
    }

    public double getQuantity(ProductAvailable productAvailable){
        return productAvailable.getQuantityAvailable();

    }


}
