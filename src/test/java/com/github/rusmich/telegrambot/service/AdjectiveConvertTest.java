package com.github.rusmich.telegrambot.service;


import org.junit.jupiter.api.Test;

public class AdjectiveConvertTest {
    @Test
    public static void main(String[] args)
    {
        String word = "динозавр";

        System.out.println(AdjectiveConvert.stem(word));
        System.out.println(OOnEndConvert.stem(word));
    }
}