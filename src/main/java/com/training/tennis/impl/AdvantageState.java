package com.training.tennis.impl;

import com.training.tennis.Player;
import com.training.tennis.ScoreState;
import com.training.tennis.TennisGameContext;

import static java.text.MessageFormat.format;

/**
 * The {@link AdvantageState} class is an implementation of {@link ScoreState} that represent the advantage game state.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class AdvantageState implements ScoreState {

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
    public void scorePoint(final TennisGameContext context, final Player player) {
        if (player == advantagePlayer) {
            context.setWinner(player);

        } else {
            context.setState(new DeuceState());
        }
    }

    @Override
    public String getScore(final TennisGameContext context) {
        return format("advantage player {0}", advantagePlayer.getSymbol());
    }
}
