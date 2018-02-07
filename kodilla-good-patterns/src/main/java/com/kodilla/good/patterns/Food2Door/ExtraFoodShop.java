package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Supplier {
    private final String name = "ExtraFoodShop";
    private final double discount = 0.1;



    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public void process(OrderRequest orderRequest) {
        System.out.println("Orderd from: " + orderRequest.getSupplier().getName() + ", product:");
        for(Product product : orderRequest.getProductsListOrder().keySet()) {
            System.out.println(product.getProductName() + " in quantity: "
                    + orderRequest.getProductsListOrder().get(product)
            + ". Total price: " + product.getPrice()*orderRequest.getProductsListOrder().get(product)*(1-discount));
        }
    }
}
