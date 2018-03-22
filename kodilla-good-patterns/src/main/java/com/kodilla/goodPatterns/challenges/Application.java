package com.kodilla.goodPatterns.challenges;

import com.kodilla.goodPatterns.challenges.products.Product;
import com.kodilla.goodPatterns.challenges.sellRequest.SellDto;
import com.kodilla.goodPatterns.challenges.sellRequest.SellRequest;
import com.kodilla.goodPatterns.challenges.sellRequest.SellRequestRetriver;
import com.kodilla.goodPatterns.challenges.selling.ItemSellService;
import com.kodilla.goodPatterns.challenges.selling.MailService;
import com.kodilla.goodPatterns.challenges.selling.ProductOrderService;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        SellRequestRetriver sellRequestRetriver = new SellRequestRetriver();
        SellRequest sellRequest = sellRequestRetriver.retrieve();

        Map<Product, Integer> productAndAvailablity = new HashMap<>();
        Product product1 = new Product("A", 2, "Geber");
        Product product2 = new Product("B", 1, "Bobo");
        productAndAvailablity.put(product1, 300);
        productAndAvailablity.put(product2, 50);

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService() ,
                new ItemSellService(productAndAvailablity));
        SellDto sellDto = productOrderService.process(sellRequest);

        System.out.println(sellDto);

    }
}
