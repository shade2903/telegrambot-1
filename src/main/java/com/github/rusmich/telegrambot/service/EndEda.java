package com.github.rusmich.telegrambot.service;

import java.util.List;
import java.util.Random;
//Класс для создания последнего слова в генерируемом предложении
public class EndEda {
    Random value = new Random();
    private int i = value.nextInt(6);

    public List<String> getList() {
        return list;
    }

    private List<String> list = List.of(
            "суп",
            "пунш",
            "коктейль",
            "борщ",
            "деликатес",
            "гуляш");


    public String getAnswer() {
        return list.get(i);
    }
}