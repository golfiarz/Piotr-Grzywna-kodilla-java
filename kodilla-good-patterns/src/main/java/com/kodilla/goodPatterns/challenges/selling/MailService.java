package com.kodilla.goodPatterns.challenges.selling;

import com.kodilla.goodPatterns.challenges.Food2Door.ProducerProduct;
import com.kodilla.goodPatterns.challenges.products.Invoice;
import com.kodilla.goodPatterns.challenges.users.Producer;
import com.kodilla.goodPatterns.challenges.users.User;

public class MailService implements InformationService{

    public void inform(User user, Invoice invoice, Producer producer, ProducerProduct producerProduct) {
        System.out.println(user.getName() + " bought "  + invoice.getItemProduct() + " by " + invoice.getValueToPay() + " in " + producer.getNameCompany());

    }
}
