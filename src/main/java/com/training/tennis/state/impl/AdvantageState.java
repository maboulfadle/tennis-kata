package com.training.tennis.state.impl;

import com.training.tennis.Game;
import com.training.tennis.Player;
import com.training.tennis.state.GameState;

import static java.text.MessageFormat.format;

/**
 * The {@link AdvantageState} class is an implementation of {@link GameState} that represent the advantage game state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class AdvantageState implements GameState {

    private final Player advantagePlayer;

    /**
     * Instantiates a new Advantage state.
     *
     * @param player the player
     */
    public AdvantageState(final Player player) {
        this.advantagePlayer = player;
    }

    @Override
    public void updateState(final Game game, final Player player) {
        if (player == advantagePlayer) {
            game.setState(new GameOverState(player));

        } else {
            game.setState(new DeuceState());
        }
    }

    @Override
    public String getScore() {
        return format("advantage player {0}", advantagePlayer.getSymbol());
    }
}
