package com.kodilla.goodPatterns.challenges.users;

import com.kodilla.goodPatterns.challenges.Food2Door.ProductAvailable;
import com.kodilla.goodPatterns.challenges.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String nameCompany;

    public Producer(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }
}



