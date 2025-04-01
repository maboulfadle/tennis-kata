package com.training.tennis.state.impl;

import com.training.tennis.Game;
import com.training.tennis.Player;
import com.training.tennis.state.GameState;

import static java.text.MessageFormat.format;

/**
 * The {@link GameOverState} class is an implementation of {@link GameState} that represent the game over state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class GameOverState implements GameState {

    private final Player winner;

    /**
     * Instantiates a new Game over state.
     *
     * @param player the player
     */
    public GameOverState(final Player player) {
        this.winner = player;
    }

    @Override
    public void updateState(final Game context, final Player player) {
        // no update, the game is already over.
    }

    @Override
    public String getScore() {
        return format("player {0} wins the game", winner.getSymbol());
    }
}
