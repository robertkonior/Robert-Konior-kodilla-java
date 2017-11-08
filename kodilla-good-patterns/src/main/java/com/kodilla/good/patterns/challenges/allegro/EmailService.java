package com.kodilla.good.patterns.challenges.allegro;

public class EmailService implements InformationService {

    public void sendMessageToBuyer(){
        System.out.println("Sending message to buyer");
    }

    public void sendMessageToSeller(){
        System.out.println("Sending message to seller ");
    }
}
