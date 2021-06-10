package com.github.rusmich.telegrambot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

import static java.lang.Math.random;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;
    @Value("${bot.token}")
    private String botToken;

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

    @Override
    //Определить какое поведение нужно совершить когда бот получает сообщение
    public void onUpdateReceived(Update update) {
        executeUpdate(update);
        //saveJson(update);
    }

    public void executeUpdate(Update update) {
        if (update != null) {
            Message message = update.getMessage();
            Long chatId = message.getChatId();
            String userName = message.getFrom().getUserName();
            if (message.getText().equals("дошик")) {

                sendMessage("Таймер активирован", chatId);
                try {
                    Thread.sleep(20000);   //тестовое время 20 секунд, проблема способа, в том что нету мультипоточности
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sendMessage("Дошик заварился " + "@" + userName, chatId);
            } else if (message.getText().equals("монетка") || message.getText().equals("подкинуть")) {
                int numberChoose = (int) (random() * 6);
                switch (numberChoose) {
                    case 1:
                        sendMessage("Вам выпала решка", chatId);
                        break;
                    case 2:
                        sendMessage("Вам выпал орёл", chatId);
                        break;
                    case 3:
                        sendMessage("Монета стала на ребро", chatId);
                        break;
                    case 4:
                        sendMessage("Монетка взмыла вверх и улетела", chatId);
                        break;
                    case 5:
                        sendMessage("Монета испарилась", chatId);
                        break;
                    default:
                        sendMessage("Монета потерялась", chatId);
                        break;
                }
            }
        }
    }

    public synchronized void sendMessage(String text, Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void saveJson(Update update) {
        try {
            objectMapper.writeValue(new File("src/test/resources/update.json"), update);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    //Имя бота
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    //Токен бота
    public String getBotToken() {
        return botToken;
    }
}
