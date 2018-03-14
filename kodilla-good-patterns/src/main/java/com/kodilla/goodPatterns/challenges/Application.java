package com.kodilla.goodPatterns.challenges;

import com.kodilla.goodPatterns.challenges.sellRequest.SellRequest;
import com.kodilla.goodPatterns.challenges.sellRequest.SellRequestRetriver;
import com.kodilla.goodPatterns.challenges.selling.ItemSellService;
import com.kodilla.goodPatterns.challenges.selling.MailService;
import com.kodilla.goodPatterns.challenges.selling.ProductOrderService;

public class Application {
    public static void main(String[] args){
        SellRequestRetriver sellRequestRetriver = new SellRequestRetriver();
        SellRequest sellRequest = sellRequestRetriver.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService() , new ItemSellService());
        productOrderService.process(sellRequest);


    }
}
