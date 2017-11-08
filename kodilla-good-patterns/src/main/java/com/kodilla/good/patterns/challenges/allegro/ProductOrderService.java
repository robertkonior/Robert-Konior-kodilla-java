package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;
import java.util.List;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final List<Order> orders) {
        int noOrder = orders.get(0).getNoOrder();
        LocalDate deliveryDay = orders.get(0).getDeliveryDate();
        String productName = orders.get(0).getProduct().getProductName();

        boolean isOrderInProgress = orderService.status(noOrder, deliveryDay, LocalDate.now());

        if (isOrderInProgress) {
            informationService.sendMessageToBuyer(productName);
            orderRepository.addOrderToExecute(noOrder);

        } else {
            informationService.sendMessageToSeller(productName);
            orderRepository.saveInOrderHistory(noOrder);

        }
        return new OrderDto(noOrder, isOrderInProgress);
    }


}
