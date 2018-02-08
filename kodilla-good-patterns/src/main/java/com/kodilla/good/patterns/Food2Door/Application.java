package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        productOrderService.addSupplier(extraFoodShop);
        productOrderService.addSupplier(new HealthyShop("HealthyShop"));
        productOrderService.addSupplier(new GlutenFreeShop("GlutenFreeShop"));

        OrderRequest orderRequest = new OrderRequest(extraFoodShop);

        Product product = new Product("P1",2);
        orderRequest.addProductToOrderList(product,5.0);

        OrderProcessor orderProcessor = new OrderProcessor(new MailServices(), productOrderService, new OrderDataBase());
        orderProcessor.process(orderRequest);
    }
}
