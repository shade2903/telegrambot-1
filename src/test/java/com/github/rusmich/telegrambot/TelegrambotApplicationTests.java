package com.github.rusmich.telegrambot;

import com.github.rusmich.telegrambot.config.Mapper;
import com.github.rusmich.telegrambot.service.MessageService;
import com.github.rusmich.telegrambot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegrambotApplicationTests {

//	@Test
	void contextLoads() {
	}

}
