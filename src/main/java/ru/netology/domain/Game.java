package ru.netology.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players = new ArrayList<>();   //объявлен список
    //  private Player[] player = new Player[0];                 //объявлен игрок


    public List<Player> getPlayers() {
        return players;
    }

    public ArrayList register(Player player) {
        players.add(player);
        return (ArrayList) players;
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;
        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }
        if (player1 == null) {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName2);
        }
        if (player1.getStrength() == player2.getStrength()) {
            return 0;
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        return 2;
    }

}
   /* public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;
        int result = 0;
        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }

            if (player.getName().equals(playerName2)) {
                player2 = player;
            }

            if (player1 == null) {
                throw new NotRegisteredException(
                        "Игрок не зарегистрирован:   " + playerName1);
            }

            if (player2 == null) {
                throw new NotRegisteredException(
                        "Игрок не зарегистрирован:   " + playerName2);
            }

            if (player1.getStrength() == player2.getStrength()) {
                result = 0;
            }
            if (player1.getStrength() > player2.getStrength()) {
                result = 1;
            }
            result = 2;
        }
        //return;
        return result;
    }*/



  /*  public int round(String playerName1, String playerName2) {
        Player player1;
        Player player2;

        boolean firstIsRegistered = players.contains(playerName1);
        boolean secondIsRegistered = players.contains(playerName2);
        if (firstIsRegistered == true) {
            if (secondIsRegistered == true) {


                if (player1.getStrength() > player2.getStrength()) {
                    return 1;
                } else if (player1.getStrength() < player2.getStrength()) {
                    return 2;
                }
                return 0;

            } else {
                throw new NotRegisteredException(
                        "Игрок не зарегистрирован:   " + playerName2);
            }
        } else {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName1);
        }


    }*/






     /*   if (firstIsRegistered == true) {
            if (secondIsRegistered == true) {
                if (player1.getStrength() > player2.getStrength()) {
                    return 1;
                } else if (player1.getStrength < player2.getStrength) {
                    return 2;
                } else return 0;
            } else {
                throw new NotRegisteredException(
                        "Игрок не зарегистрирован:   " + playerName2);
            }
        } else {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName1);
        }
    }*/


//private List<Player> players = new ArrayList<Player>();   //объявлен список
// private Player[] player = new Player[0];                 //объявлен игрок

    /* public List<Player> register(Player player) {        //метод register, который возвращает список с зарег игроками после добавления нового
        List<Player> players = new ArrayList<Player>(players.size() + 1);
        for (int i = 0; i < players.size(); i++) {
            players.set(i, players.get(i));
        }
        players.set(players.size() - 1, player);
        return players;
    }*/



   /* public int round(String playerName1, String playerName2) {
        boolean firstIsRegistered = players.contains(playerName1);
        boolean secondIsRegistered = players.contains(playerName2);
        if (firstIsRegistered == true) {
            if (secondIsRegistered == true) {
                if (player1.getStrength > player2.getStrength) {
                    return 1;
                } else if (player1.getStrength < player2.getStrength) {
                    return 2;
                } else return 0;
            } else {
                throw new NotRegisteredException(
                        "Игрок не зарегистрирован:   " + playerName2);
            }
        } else {
            throw new NotRegisteredException(
                    "Игрок не зарегистрирован:   " + playerName1);
        }
    }*/



   /* public List<Player> round(String playerName1, String playerName2) {
        boolean firstIsRegistered = players.contains(playerName1);
        boolean secondIsRegistered = players.contains(playerName2);
        if (firstIsRegistered == true) {
            if (secondIsRegistered == true) {


                if (player1.getStrength > player2.getStrength) {

                } else {
                    throw new NotRegisteredException(
                            "Игрок не зарегистрирован:   " + playerName2);
                }
            } else {
                throw new NotRegisteredException(
                        "Игрок не зарегистрирован:   " + playerName1);
            }

        }
        return;
    }*/

     /*    List<Player> players = new ArrayList<Player>();
        players.add(new Player(player.getId(),player.
                getName(),player.getStrength()));
        // players.set(players.size() - 1, player);
        return players;
    }*/

   /* public List<> register(Player player) {        //метод register, который возвращает список с зарег игроками после добавления нового
        List<Player> players = new ArrayList<Player>();
        players.add(new Player(player.getId(), player.getName(), player.getStrength()));
        return players;
    }*/
