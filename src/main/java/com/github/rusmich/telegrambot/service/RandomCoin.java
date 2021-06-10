package com.github.rusmich.telegrambot.service;

import java.util.List;
import java.util.Random;

public class RandomCoin {
    Random value = new Random();
    private int i = value.nextInt(5);

    public List<String> getList() {
        return list;
    }

    private List<String> list = List.of(
            "Выпал Орел",
            "Выпала решка",
            "Монетка упала и встала на ребро",
            "Леприкон стянул монетку",
            "Монетку словила сорока и унесла в гнездо");


    public String getAnswer() {
        return list.get(i);
    }
}
