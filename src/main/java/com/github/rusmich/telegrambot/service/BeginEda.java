package com.github.rusmich.telegrambot.service;
import java.util.List;
import java.util.Random;
//Класс для создания первого слова в генерируемом предложении
public class BeginEda {
    Random value = new Random();
    private int i = value.nextInt(5);

    public List<String> getList() {
        return list;
    }

    private List<String> list = List.of(
            "Жареный",
            "Постный",
            "Вареный",
            "Взбитый в блендере",
            "Вкрутую свареный");


    public String getAnswer() {
        return list.get(i);
    }
}