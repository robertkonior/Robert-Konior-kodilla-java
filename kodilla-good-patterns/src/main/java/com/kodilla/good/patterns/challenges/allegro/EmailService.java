package com.kodilla.good.patterns.challenges.allegro;

public class EmailService implements InformationService {

    public void sendMessageToBuyer(String productName){
        System.out.println("Sending message to buyer about his " + productName);
    }

    public void sendMessageToSeller(String productName){
        System.out.println("Sending message to seller about his " + productName);
    }
}
