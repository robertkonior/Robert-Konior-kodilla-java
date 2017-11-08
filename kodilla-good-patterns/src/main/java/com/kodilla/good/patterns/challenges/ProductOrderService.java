package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

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

    public OrderDto process( final Order order) {
        int noOrder = order.getNoOrder() ;
        LocalDate deliveryDay = order.getDeliveryDate();


        boolean isOrderInProgress = orderService.status(noOrder,deliveryDay, LocalDate.now());
        User buyer = order.getBuyer();
        User seller =order.getSeller();

                if (isOrderInProgress) {
                    informationService.sendMessageToBuyer();
                    orderRepository.addOrderToExecute(noOrder);

                    return new OrderDto(noOrder , true);

                }else {
                    informationService.sendMessageToSeller();
                    orderRepository.saveInOrderHistory(noOrder);
                    return new OrderDto(noOrder, false);
                }
    }


}
