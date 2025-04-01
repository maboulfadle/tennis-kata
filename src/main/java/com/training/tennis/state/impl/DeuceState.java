package com.training.tennis.state.impl;

import com.training.tennis.Game;
import com.training.tennis.Player;
import com.training.tennis.state.GameState;

/**
 * The {@link DeuceState} class is an implementation of {@link GameState} that represent the deuce game state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class DeuceState implements GameState {

    private static final String DEUCE = "deuce";

    @Override
    public void updateState(final Game game, Player player) {
        game.setState(new AdvantageState(player));
    }

    @Override
    public String getScore() {
        return DEUCE;
    }
}
