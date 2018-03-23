package com.kodilla.rsp;

import java.util.Random;

public class ComputerPlayer {

    public Move play() {
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
