package ru.netology.domain;

import java.util.ArrayList;

public class Player {


    private int id;
    private String name;
    private Integer strength;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }


    public Player(int id, String name, Integer strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

}
