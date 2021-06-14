package com.github.rusmich.telegrambot.service;

import java.util.List;
import java.util.Random;
//Класс для создания последнего слова в генерируемом предложении
public class EndEda {
    Random value = new Random();

    public List<String> getList() {
        return list;
    }

    private List<String> list = List.of(
            "суп",
            "пунш",
            "коктейль",
            "борщ",
            "салат",
            "пудинг",
            "десерт",
            "торт",
            "пирог",
            "деликатес",
            "гуляш");

    private int i = value.nextInt(list.size());

    public String getAnswer() {
        return list.get(i);
    }
}