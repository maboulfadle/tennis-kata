package com.training.tennis.state;

import com.training.tennis.Game;
import com.training.tennis.Player;

/**
 * The {@link GameState} interface contains functions related to tennis game states.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public interface GameState {

    /**
     * Update the state of the given {@code game} when the given {@code player} scored a point.
     *
     * @param game the tennis game
     * @param player  the scoring player
     */
    void updateState(final Game game, final Player player);

    /**
     * Gets score.
     *
     * @return the score
     */
    String getScore();
}
