package com.kodilla.rsp;

public enum Move {

    ROCK, PAPER, SCISSORS;

    public int compareMoves(Move otherMove) {
        // Tie
        if (this == otherMove)
            return 0;

        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);
        }

        // Should never reach here
        return 0;
    }
}
