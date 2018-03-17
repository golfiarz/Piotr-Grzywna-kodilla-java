package com.kodilla.goodPatterns.challenges.selling;

import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.users.User;

public class MailService implements InformationService{

    public void inform(User user, Invoice invoice) {
        System.out.println(user.getName() + " "  + invoice.getValueToPay());

    }
}
