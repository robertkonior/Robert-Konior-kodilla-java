package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public interface OrderService {
    boolean status(int noOrder, LocalDate deliveryDate, double orderPrice);
}
