package com.training.tennis.state.impl;

import com.training.tennis.Game;
import com.training.tennis.Player;
import com.training.tennis.Score;
import com.training.tennis.state.GameState;

import static java.text.MessageFormat.format;

/**
 * The {@link DefaultState} class is the default implementation of {@link GameState} that represent the normal game state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class DefaultState implements GameState {

    private final Player player1;
    private final Player player2;

    public DefaultState(final Player player1, final Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void updateState(final Game game, final Player scoringPlayer) {
        if (scoringPlayer.hasFortyPoints()) {
            game.setState(new GameOverState(scoringPlayer));
            return;
        }

        scoringPlayer.incrementScore();

        if (player1.hasFortyPoints() && player2.hasFortyPoints()) {
            game.setState(new DeuceState());
        }
    }

    @Override
    public String getScore() {
        return format("player a: {0} & player b: {1}",
                player1.getScore().getPoints(),
                player2.getScore().getPoints());
    }
}