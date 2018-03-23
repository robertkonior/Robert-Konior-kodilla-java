package com.kodilla.rsp;

public class RpsPrinter {

    public static void printInstructions() {
        System.out.println("Key 1 - play \"stone\"" + "\n" + "Key 2 - play \"paper\""
                + "\n" + "Key 3 - play \"scissors\"" + "\n"
                + "Key x - end the game. " + "\n" + "Key n - start new game. ");
    }

    public static void optionNotValid() {
        System.out.println("Invalid number!");
        System.out.println("Introduce a number between 1 and 3.");
    }

    public static void setTheVictoryPoint() {
        System.out.println("Set the victory point");
    }

    public static void confirmEndGame() {
        System.out.println("Are you sure you want to end the game? "
                + "Confirm. \"x\" to exit or press any key if you want back to game");
    }

    public static void askWhatNext() {
        System.out.println("GAME OVER" + "\n" + "Key x - end the game. "
                + "\n" + "Key n - start new game. ");
    }

    public static void confirmNewGame() {
        System.out.println("Are you  want to start new game? "
                + "Confirm. \"n\" to start or press any key to back to select menu");
    }

    public static void showResult(int userScore, int computerScore) {
        System.out.println("Game Result: Human: " + userScore + " Computer: " + computerScore);
    }

    public static void showComputerMove(Move move) {
        System.out.println("Computer play: " + move);
    }

    public static void showUserMove(Move move) {
        System.out.println("You play: " + move);
    }
}
