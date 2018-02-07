package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRequest {
    private Supplier supplier;
    private Map<Product, Double> productsListOrder;

    public OrderRequest(Supplier supplier) {
        this.supplier = supplier;
        this.productsListOrder = new HashMap<>();
    }

    public void addProductToOrderList(Product product, Double quantity){
        productsListOrder.put(product, quantity);
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Map<Product, Double> getProductsListOrder() {
        return productsListOrder;
    }
}
