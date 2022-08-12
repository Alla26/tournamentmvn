package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GameTest {
    Game game = new Game();
    Player[] player = new Player[0];

    Player player1 = new Player(1, "Игрок1", 10_000);
    Player player2 = new Player(2, "Игрок2", 23_000);
    Player player3 = new Player(3, "Игрок3", 7_000);
    Player player4 = new Player(4, "Игрок4", 23_000);

    @Test

    public void shouldRegisteredPlayer() {


        HashMap<String, Integer> expected = new HashMap<>();

        expected.put(player3.getName(), player3.getStrength());

        HashMap actual = game.register(player3);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldChooseWinnerFirst() {

        HashMap<String, Integer> players = new HashMap<>();

        game.register(player1);
        game.register(player3);


        int expected = 1;

        int actual = game.round("Игрок1", "Игрок3");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChooseWinnerSecond() {

        HashMap<String, Integer> players = new HashMap<>();
        game.register(player1);
        game.register(player2);


        int expected = 2;

        int actual = game.round("Игрок1", "Игрок2");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowDraw() {

        HashMap<String, Integer> players = new HashMap<>();
        game.register(player2);
        game.register(player4);


        Integer expected = 0;

        Integer actual = game.round("Игрок2", "Игрок4");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionFirstNotRegistered() {

        HashMap<String, Integer> players = new HashMap<>();
        game.register(player4);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Игрок2", "Игрок4");
        });

    }

    @Test
    public void shouldThrowExceptionSecondNotRegistered() {

        HashMap<String, Integer> players = new HashMap<>();
        game.register(player3);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Игрок3", "Игрок7");
        });

    }

}



