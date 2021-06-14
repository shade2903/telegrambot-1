package com.github.rusmich.telegrambot.service;
import java.util.List;
import java.util.Random;
//Класс для создания первого слова в генерируемом предложении
public class BeginEda {
    Random value = new Random();

    public List<String> getList() {
        return list;
    }

    private List<String> list = List.of(
            "Жареный",
            "Копчёный",
            "Охлаждённый",
            "Маринованный",
            "Постный",
            "Вареный",
            "Классический",
            "Запеченый",
            "Тушеный",
            "Пикантный",
            "Экзотический",
            "Домашний",
            "Питательный",
            "Хрустящий",
            "Глазированный",
            "Пассерованный",
            "Подрумяненный",
            "Изысканный",
            "Приготовленный на пару",
            "Традиционный",
            "Взбитый в блендере",
            "Вкрутую свареный");
    private int i = value.nextInt(list.size());

    public String getAnswer() {
        return list.get(i);
    }
}