package com.training.tennis;

import com.training.tennis.state.GameState;
import com.training.tennis.state.impl.DefaultState;

/**
 * The {@link Game} class represents the unique tennis game that has two players
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class Game {

    private final Player player1;
    private final Player player2;
    private final ScoreBoard scoreBoard;
    private GameState state;

    public Game() {
        player1 = new Player('a');
        player2 = new Player('b');
        state = new DefaultState(player1, player2);
        scoreBoard = new ScoreBoard();
    }

    /**
     * Start the tennis game.
     *
     * @param points the scored points.
     */
    public void start(final String points) {
        if (points == null || points.isEmpty() || !points.matches("[ab]+")) {
            throw new IllegalArgumentException("Invalid input sequence. Only 'a' and 'b' are allowed.");
        }

        for (final char point : points.toCharArray()) {
            final Player scoringPlayer = getPlayer(point);

            updateGameState(scoringPlayer);

            scoreBoard.displayScore(this);
        }
    }

    private void updateGameState(final Player player) {
        state.updateState(this, player);
    }

    /**
     * Gets game state.
     */
    public GameState getState() {
        return state;
    }

    /**
     * Sets game state.
     *
     * @param newState the new state
     */
    public void setState(final GameState newState) {
        this.state = newState;
    }

    /**
     * Gets player for the given {@code symbol}.
     *
     * @return the symbol
     */
    public Player getPlayer(final char symbol) {
        final Player player;

        if (symbol == 'a') {
            player = player1;
        } else {
            player = player2;
        }
        return player;
    }
}

