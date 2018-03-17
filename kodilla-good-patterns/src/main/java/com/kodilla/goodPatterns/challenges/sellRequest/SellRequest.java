package com.kodilla.goodPatterns.challenges.sellRequest;

import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.users.User;

public class SellRequest {

    public User user;
    public Invoice invoice;

    public SellRequest(final User user, final Invoice invoice) {
        this.user = user;
        this.invoice = invoice;
    }

    public User getUser() {
        return user;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
