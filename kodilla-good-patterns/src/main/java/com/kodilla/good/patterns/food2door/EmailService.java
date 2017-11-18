package com.kodilla.good.patterns.food2door;



public class EmailService implements InformationService {

    public void sendMessageToBuyer(String productName){
        System.out.println("Sending message to buyer about his " + productName);
    }

}
