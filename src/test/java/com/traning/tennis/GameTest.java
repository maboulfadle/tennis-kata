package com.traning.tennis;

import com.training.tennis.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The {@link GameTest} class contains the unit tests of {@link Game} class.
 *
 * @author mohammed aboulfadle
 * @since 2025.03
 */
class GameTest {

    @Test
    void testInitialScore() {
        final Game game = new Game();
        assertEquals("player a: 0 & player b: 0", game.getState().getScore());
    }

    @Test
    void testPlayer1_winsPoint() {
        final Game game = new Game();
        game.start("a");
        assertEquals("player a: 15 & player b: 0", game.getState().getScore());
    }

    @Test
    void testPlayer2_winsPoint() {
        final Game game = new Game();
        game.start("b");
        assertEquals("player a: 0 & player b: 15", game.getState().getScore());
    }

    @Test
    void testStandardProgression() {
        final Game game = new Game();
        game.start("abab");
        assertEquals("player a: 30 & player b: 30", game.getState().getScore());
    }

    @Test
    void testDeuce() {
        final Game game = new Game();
        game.start("ababab");
        assertEquals("deuce", game.getState().getScore());
    }

    @Test
    void testAdvantage() {
        final Game game = new Game();
        game.start("abababa");
        assertEquals("advantage player a", game.getState().getScore());
    }

    @Test
    void testAdvantage_LostBackToDeuce() {
        final Game game = new Game();
        game.start("abababab");
        assertEquals("deuce", game.getState().getScore());
    }

    @Test
    void testPlayer1_winsAfterAdvantage() {
        final Game game = new Game();
        game.start("abababaa");
        assertEquals("player a wins the game", game.getState().getScore());
    }

    @Test
    void testPlayer2_winsAfterAdvantage() {
        final Game game = new Game();
        game.start("ababababbb");
        assertEquals("player b wins the game", game.getState().getScore());
    }

    @Test
    void testPlayer1_winsDirectly() {
        final Game game = new Game();
        game.start("aaaa");
        assertEquals("player a wins the game", game.getState().getScore());
    }

    @Test
    void testPlayer2_winsDirectly() {
        final Game game = new Game();
        game.start("bbbb");
        assertEquals("player b wins the game", game.getState().getScore());
    }

    @Test
    void testInvalidInputThrowsException() {
        final Game game = new Game();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> game.start("abcx"));
        assertEquals("Invalid input sequence. Only 'a' and 'b' are allowed.", exception.getMessage());
    }
}

