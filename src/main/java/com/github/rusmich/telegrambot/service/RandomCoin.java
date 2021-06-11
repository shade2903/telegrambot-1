package com.github.rusmich.telegrambot.service;

import java.util.List;
import java.util.Random;

public class RandomCoin extends Potok {
    Random value = new Random();
    private int i = value.nextInt(7);

    private List<String> list = List.of(
            "Выпал Орел",
            "Выпала решка",
            "Монетка упала и встала на ребро",
            "Леприкон стянул монетку",
            "Монетку словила сорока и унесла в гнездо",
            "Налоговый инспектор конфисковал монетку",
            "Толпа гопников отжала монетку");

    public String getAnswer() {
        return list.get(i);
    }
}
