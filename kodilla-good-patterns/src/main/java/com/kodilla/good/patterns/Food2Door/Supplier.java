package com.kodilla.good.patterns.Food2Door;

public interface Supplier {
    void process(final OrderRequest orderRequest);

    String getName();
}
