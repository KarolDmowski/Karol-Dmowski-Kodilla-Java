package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Supplier {
    private String name;

    public HealthyShop(String name) {
        this.name = name;
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("HealthyShop orderd - product list:");
        for(Product product : orderRequest.getProductsListOrder().keySet()) {
            System.out.println(product.getProductName() + " in quantity: "
                    + orderRequest.getProductsListOrder().get(product)
                    + ". Total price: " + product.getPrice()*orderRequest.getProductsListOrder().get(product));
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
