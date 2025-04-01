package com.training.tennis;

import com.training.tennis.state.GameState;

/**
 * The {@link GameState} enum represents the tennis game scored points.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public enum Score {

    ZERO(0),
    FIFTEEN(15),
    THIRTY(30),
    FORTY(40);

    private final int points;

    Score(final int points) {
        this.points = points;
    }

    /**
     * Gets points.
     *
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Gets the next score.
     *
     * @return the score
     */
    public Score next() {
        return switch (this) {
            case ZERO -> FIFTEEN;
            case FIFTEEN -> THIRTY;
            default -> FORTY;
        };
    }
}