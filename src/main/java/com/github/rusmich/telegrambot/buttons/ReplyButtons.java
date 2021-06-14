package com.github.rusmich.telegrambot.buttons;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

public class ReplyButtons {
    public ReplyKeyboardMarkup keyboardMarkup(){
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("монетка");
        keyboardFirstRow.add("дошик");
        keyboardFirstRow.add("Куда поехать отдохнуть");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;




    }
}
