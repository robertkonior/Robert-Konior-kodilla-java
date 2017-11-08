package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TransactionLists implements OrderRepository {


    List<Integer> inProgressList = new LinkedList<>();
    List<Integer> listOfFinishedOrders = new ArrayList<>();

    @Override
    public void addOrderToExecute(int noOrder) {
        inProgressList.add(noOrder);
    }

    @Override
    public void saveInOrderHistory(int noOrder) {
        listOfFinishedOrders.add(noOrder);
    }

}
