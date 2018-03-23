package com.kodilla.rsp;

import java.util.Scanner;

public class RpsGame {

    private ComputerPlayer computer;
    private int userScore = 0;
    private int computerScore = 0;
    private Scanner input = new Scanner(System.in);

    public RpsGame() {
        this.computer = new ComputerPlayer();
    }

    public void run() {
        int numbersOfWins = getWinPoint();
        while (!isOver(numbersOfWins)) {
            Move humanMove = play();
            Move computerMove = computer.play();
            RpsPrinter.showUserMove(humanMove);
            RpsPrinter.showComputerMove(computerMove);
            int compareMoves = humanMove.compareMoves(computerMove);
            switch (compareMoves) {
                case 0: // Tie
                    System.out.println("Tie!");
                    break;
                case 1: // User wins
                    System.out.println(humanMove + " beats " + computerMove + ". You won!");
                    userScore++;
                    break;
                case -1: // Computer wins
                    System.out.println(computerMove + " beats " + humanMove + ". You lost.");
                    computerScore++;
                    break;
            }
            RpsPrinter.showResult(userScore, computerScore);
        }
        afterGame();
    }

    private Move play() {
        String pressedKey = getUserChoice();
        if (pressedKey.equals("1") || pressedKey.equals("2") || pressedKey.equals("3")) {

            switch (pressedKey) {
                case "1":
                    return Move.ROCK;
                case "2":
                    return Move.PAPER;
                case "3":
                    return Move.SCISSORS;
            }
        } else if (pressedKey.equals("n")) {
            setNewGame();
        } else if (pressedKey.equals("x")) {
            userWantsToQuit();
        }
        RpsPrinter.optionNotValid();
        return play();
    }

    private String getUserChoice() {
        RpsPrinter.printInstructions();
        return input.next();
    }

    private void userWantsToQuit() {
        RpsPrinter.confirmEndGame();
        if (input.next().equals("x")) {
            System.exit(0);
        }
        afterGame();
    }

    private int getWinPoint() {
        RpsPrinter.setTheVictoryPoint();
        return input.nextInt();
    }

    private boolean isOver(int toWiningPoint) {
        if (userScore == toWiningPoint || computerScore == toWiningPoint) {
            return true;
        } else
            return false;
    }

    private void setNewGame() {
        RpsPrinter.confirmNewGame();
        if (input.next().equals("n")) {
            this.userScore = 0;
            this.computerScore = 0;
            run();
        }
        afterGame();
    }

    private void afterGame() {
        RpsPrinter.showResult(userScore, computerScore);
        RpsPrinter.askWhatNext();
        String decision = input.next();
        switch (decision) {
            case "n":
                setNewGame();
                break;
            case "x":
                userWantsToQuit();
        }
    }
}


