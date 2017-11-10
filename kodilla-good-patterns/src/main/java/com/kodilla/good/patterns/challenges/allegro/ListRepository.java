package com.kodilla.good.patterns.challenges.allegro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRepository implements OrderRepository {


    private List<Integer> inProgressList = new LinkedList<>();
    private List<Integer> listOfFinishedOrders = new ArrayList<>();

    @Override
    public void addOrderToExecute(int noOrder) {
        inProgressList.add(noOrder);
    }

    @Override
    public void saveInOrderHistory(int noOrder) {
        listOfFinishedOrders.add(noOrder);
    }

}
