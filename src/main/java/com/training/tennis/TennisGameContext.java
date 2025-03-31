package com.training.tennis;

import com.training.tennis.impl.DefaultScoreState;

import java.util.Map;

import static java.text.MessageFormat.format;

/**
 * The {@link TennisGameContext} class is ...
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
public class TennisGameContext {

    private static final TennisGameContext INSTANCE = new TennisGameContext();
    private static final Map<Character, Player> players;

    private ScoreState state = new DefaultScoreState();
    private Player winner = null;

    static {
        players = Map.of(
            'a', new Player('a'),
            'b', new Player('b')
        );
    }

    public static TennisGameContext getInstance() {
        return INSTANCE;
    }

    public Player getPlayer(final char name) {
        return players.get(name);
    }

    public Player getOpponent(final Player player) {
        final char opponent;

        if (player.getSymbol() == 'a') {
            opponent = 'b';
        } else {
            opponent = 'a';
        }

        return players.get(opponent);
    }

    public void setState(final ScoreState newState) {
        this.state = newState;
    }

    public void setWinner(final Player player) {
        this.winner = player;
    }

    public void playGame(final String input) {
        for (final char point : input.toCharArray()) {
            final Player scoringPlayer = getPlayer(point);
            state.scorePoint(this, scoringPlayer);

            if (isGameOver()) {
                System.out.println(format("player {0} wins the game", winner.getSymbol()));
                return;
            }

            System.out.println(state.getScore(this));
        }
    }

    private boolean isGameOver() {
        return winner != null;
    }
}

