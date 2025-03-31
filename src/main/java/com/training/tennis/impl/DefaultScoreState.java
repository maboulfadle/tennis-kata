package com.training.tennis.impl;

import com.training.tennis.Player;
import com.training.tennis.ScoreState;
import com.training.tennis.TennisGameContext;

/**
 * The {@link DefaultScoreState} class is the default implementation of {@link ScoreState} that represent the normal game state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class DefaultScoreState implements ScoreState {

    @Override
    public void scorePoint(final TennisGameContext context, final Player player) {
        if (player.hasFortyPoints()) {
            context.setWinner(player);
        }

        final Player opponent = context.getOpponent(player);

        player.incrementScore();

        if (isDeuce(player, opponent)) {
            context.setState(new DeuceState());
        }
    }

    @Override
    public String getScore(final TennisGameContext context) {
        return "player a: " + context.getPlayer('a').getScore().getPoints() + " & player b: " + context.getPlayer('b').getScore().getPoints();
    }

    private boolean isDeuce(final Player player, final Player opponent) {
        return player.hasFortyPoints() && opponent.hasFortyPoints();
    }
}