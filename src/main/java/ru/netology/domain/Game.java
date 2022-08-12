package ru.netology.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {

    // private List<Player> players = new ArrayList<>();   //объявлен список
    //  private Player[] player = new Player[0];                 //объявлен игрок
    private HashMap<String, Integer> players = new HashMap<String, Integer>();
    // private HashMap<String, String> players = new HashMap<String, String>();
    private Player player;


    public HashMap<String, Integer> getPlayers() {
        return players;
    }

    public HashMap register(Player player) {
        players.put(player.getName(), player.getStrength());
        return (HashMap) players;
    }

    public Integer round(String playerName1, String playerName2) {
        Integer strength1 = null;
        Integer strength2 = null;
        for (String key : players.keySet()) {
            if (key.equals(playerName1)) {
                strength1 = players.get(key);
            }
            if (key.equals(playerName2)) {
                strength2 = players.get(key);
            }
        }
        if (strength1 == null) {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName1);
        }
        if (strength2 == null) {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName2);
        }
        if (strength1.equals(strength2)) {
            return 0;
        }
        if (strength1 > strength2) {
            return 1;
        }
        return 2;
    }


}
