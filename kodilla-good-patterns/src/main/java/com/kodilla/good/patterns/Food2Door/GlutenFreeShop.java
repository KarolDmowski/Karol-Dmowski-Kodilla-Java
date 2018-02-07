package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements Supplier {
    private String name;

    public GlutenFreeShop(String name) {
        this.name = name;
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Orderd from: " + orderRequest.getSupplier().getName() + ", product:");
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
