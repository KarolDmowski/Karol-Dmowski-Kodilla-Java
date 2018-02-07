package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderService implements OrderService {
    private List<Supplier> supplierList;

    public ProductOrderService() {
        this.supplierList = new ArrayList<>();
    }

    public void addSupplier(Supplier supplier){
        supplierList.add(supplier);
    }

    public void removeSupplier(Supplier supplier) {
        supplierList.remove(supplier);
    }
    @Override
    public boolean createOrder(OrderRequest orderRequest ) {
        if (supplierList.contains(orderRequest.getSupplier())) {
            return true;
        } else {
            return false;
        }
    }
}

