package com.training.tennis;

/**
 * The {@link ScoreBoard} class represents the tennis game scoreboard.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class ScoreBoard {

    /**
     * Display score.
     *
     * @param game the game
     */
    public void displayScore(final Game game) {
        System.out.println(game.getState().getScore());
    }
}
