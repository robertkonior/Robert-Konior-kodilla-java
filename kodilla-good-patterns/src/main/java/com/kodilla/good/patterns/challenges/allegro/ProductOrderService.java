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

    public OrderDto process(final Order order) {
        int noOrder = order.getNoOrder();
        LocalDate deliveryDay = order.getDeliveryDate();
        String productName = order.getProduct().getProductName();
        double orderPrice =order.getProduct().getProductPrince() * order.getAmount();

        boolean isOrderInProgress = orderService.status(noOrder, deliveryDay , orderPrice);

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
