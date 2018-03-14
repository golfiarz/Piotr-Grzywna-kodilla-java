package com.kodilla.goodPatterns.challenges;

public class Application {
    public static void main(String[] args){
        SellRequestRetriver sellRequestRetriver = new SellRequestRetriver();
        SellRequest sellRequest = sellRequestRetriver.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService() , new ItemSellService(), new ItemsSellRespository());
        productOrderService.process(sellRequest);


    }
}
