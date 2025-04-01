package com.training.tennis;

/**
 * The {@link Player} class represents the tennis game player.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class Player {

    private final char symbol;
    private Score score;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Player(final char name) {
        this.symbol = name;
        this.score = Score.ZERO;
    }

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public Score getScore() {
        return score;
    }

    /**
     * Increment score.
     */
    public void incrementScore() {
        this.score = this.score.next();
    }

    /**
     * Has forty points boolean.
     *
     * @return the boolean
     */
    public boolean hasFortyPoints() {
        return this.score == Score.FORTY;
    }
}
