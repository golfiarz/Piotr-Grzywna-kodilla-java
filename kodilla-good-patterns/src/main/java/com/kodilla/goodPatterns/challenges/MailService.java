package com.kodilla.goodPatterns.challenges;

public class MailService implements InformationService{

    public void inform(User user, Invoice invoice) {
        System.out.println(user.getName() + " " + invoice.getValueToPay());

    }
}
