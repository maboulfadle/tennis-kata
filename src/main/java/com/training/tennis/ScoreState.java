package com.training.tennis;

/**
 * The {@link ScoreState} interface is ...
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public interface ScoreState {

    /**
     * Score point.
     *
     * @param context the context
     * @param player  the player
     */
    void scorePoint(final TennisGameContext context, final Player player);

    /**
     * Gets score.
     *
     * @param context the context
     * @return the score
     */
    String getScore(final TennisGameContext context);
}
