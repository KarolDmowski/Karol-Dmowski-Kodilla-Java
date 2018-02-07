package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest);

        if(isOrdered) {
            informationService.inform();
            orderRepository.createOrder();
            orderRequest.getSupplier().process(orderRequest);
            return new OrderDto(orderRequest, true);

        } else {
            return new OrderDto(orderRequest, false);
        }
    }
}
