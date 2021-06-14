package com.github.rusmich.telegrambot.service;


public class AdjectiveConvertTest {

    public static void main(String[] args)
    {
        String word = "наркоман";

        System.out.println(AdjectiveConvert.stem(word));
        System.out.println(OOnEndConvert.stem(word));
    }
}