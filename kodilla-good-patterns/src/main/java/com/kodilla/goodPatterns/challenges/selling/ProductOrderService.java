package com.kodilla.goodPatterns.challenges.selling;

import com.kodilla.goodPatterns.challenges.sellRequest.SellDto;
import com.kodilla.goodPatterns.challenges.sellRequest.SellRequest;

public class ProductOrderService {
    private InformationService informationService;
    private SellService sellService;

    public ProductOrderService(final InformationService informationService, final SellService sellService) {
        this.informationService = informationService;
        this.sellService = sellService;

    }

    public SellDto process(final SellRequest sellRequest) {
        boolean isSold = sellService.sell(sellRequest.getUser(), sellRequest.getInvoice());

        if (isSold) {
            informationService.inform(sellRequest.getUser(), sellRequest.getInvoice());
            sellService.sell(sellRequest.getUser(), sellRequest.getInvoice());
            return new SellDto(sellRequest.getUser(), true);
        } else {
            return new SellDto(sellRequest.getUser(), false);
        }


    }
}
