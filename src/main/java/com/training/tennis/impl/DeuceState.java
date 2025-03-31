package com.training.tennis.impl;

import com.training.tennis.Player;
import com.training.tennis.ScoreState;
import com.training.tennis.TennisGameContext;

/**
 * The {@link DeuceState} class is an implementation of {@link ScoreState} that represent the deuce game state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class DeuceState implements ScoreState {

    private static final String DEUCE = "deuce";

    @Override
    public void scorePoint(final TennisGameContext context, Player player) {
        context.setState(new AdvantageState(player));
    }

    @Override
    public String getScore(final TennisGameContext context) {
        return DEUCE;
    }
}
