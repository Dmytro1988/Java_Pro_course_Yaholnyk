package com.hillel.game.services;

import com.hillel.game.dto.GameItems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {
    @Test
    void testRockVsScissors() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.ROCK);
        game.setComputerChoice(GameItems.CHOICES.SCISSORS);
        assertEquals(GameItems.RESULT.WIN, game.getResult());
    }

    @Test
    void testScissorsVsPaper() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.SCISSORS);
        game.setComputerChoice(GameItems.CHOICES.PAPER);
        assertEquals(GameItems.RESULT.WIN, game.getResult());
    }

    @Test
    void testRockVsRock() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.ROCK);
        game.setComputerChoice(GameItems.CHOICES.ROCK);
        assertEquals(GameItems.RESULT.TIE, game.getResult());
    }
    @Test
    void testPaperVsRock() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.PAPER);
        game.setComputerChoice(GameItems.CHOICES.ROCK);
        assertEquals(GameItems.RESULT.WIN, game.getResult());
    }

    @Test
    void testRockVsPaper() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.ROCK);
        game.setComputerChoice(GameItems.CHOICES.PAPER);
        assertEquals(GameItems.RESULT.LOSE, game.getResult());
    }

    @Test
    void testPaperVsScissors() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.PAPER);
        game.setComputerChoice(GameItems.CHOICES.SCISSORS);
        assertEquals(GameItems.RESULT.LOSE, game.getResult());
    }

    @Test
    void testScissorsVsRock() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.SCISSORS);
        game.setComputerChoice(GameItems.CHOICES.ROCK);
        assertEquals(GameItems.RESULT.LOSE, game.getResult());
    }

    @Test
    void testScissorsVsScissors() {
        GameService game = new GameService();
        game.setPlayerChoice(GameItems.CHOICES.SCISSORS);
        game.setComputerChoice(GameItems.CHOICES.SCISSORS);
        assertEquals(GameItems.RESULT.TIE, game.getResult());
    }

}