package com.github.rusmich.telegrambot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.rusmich.telegrambot.TelegrambotApplicationTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

class TelegramBotTest extends TelegrambotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;

//    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        telegramBot.onUpdateReceived(update);
    }
//    @Test
    void sendMessage() throws TelegramApiException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(305388925L);
        sendMessage.setText("Hello bot");
        telegramBot.execute(sendMessage);
    }

}