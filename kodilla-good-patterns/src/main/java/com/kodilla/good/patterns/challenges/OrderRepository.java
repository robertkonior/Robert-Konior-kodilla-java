package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {
    void addOrderToExecute(int noOrder);
    void saveInOrderHistory(int noOrder);
}
