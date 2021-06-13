package com.github.rusmich.telegrambot.service;


public class AdjectiveConvertTest {

    public static void main(String[] args)
    {
        String word = "Зефир";

        System.out.println(AdjectiveConvert.stem(word));
    }
}