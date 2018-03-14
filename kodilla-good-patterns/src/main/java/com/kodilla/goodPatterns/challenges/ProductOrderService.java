package com.kodilla.goodPatterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SellService sellService;
    private SellRespository sellRespository;

    public ProductOrderService(final InformationService informationService, final SellService sellService, final SellRespository sellRespository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRespository = sellRespository;
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
