package com.kodilla.rsp;

import java.util.Random;
import java.util.Scanner;

public class RpsLogic {

    private Scanner sc = new Scanner(System.in);
    private int userScore = 0;
    private int computerScore = 0;
    private static final String RULES = "\nKey 1 - play \"stone\"" + "\n" + "Key 2 - play \"paper\""
            + "\n" + "Key 3 - play \"scissors\"" + "\n" + "Key x - end the game. "
            + "\n" + "Key n - start new game. ";


    public void letsPlay() {
        System.out.println("Give your name");
        String userChoice = getUserChoice();
        int computerChoice = getComputerChoice();
        getGameResult(getUserChoice(),getComputerChoice());
    }


    private String getUserChoice() {
        System.out.println(RULES);
        String userChoice = sc.next();
        if (!choiceValidator(userChoice)) {
            System.out.println("You entered incorrect data , please repeat: ");
            userChoice = sc.next();
        }
        return userChoice;
    }

    private boolean choiceValidator(String pressedKey) {
        if (       pressedKey.equals("1")
                || pressedKey.equals("2")
                || pressedKey.equals("3")) {
            return true;
        }

        if (pressedKey.equals("x")
                || pressedKey.equals("y")) {
            launchOperator(pressedKey);
            return  false;

        } else
            return false;
    }

    private void getGameResult(String userChoice, int computerChoice) {

    }


    private void launchOperator(String key) {

    }

    private int getComputerChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }


}
