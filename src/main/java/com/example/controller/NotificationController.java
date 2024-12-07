package com.example.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class NotificationController {

	private static final String COMMON_LOG = "NotificationController.";

// Server Application
//	/app/sendMessage
	@MessageMapping("/sendMessage")
	@SendTo("/topic/notifications")
	public String sendMessage(String msg) {
		log.info("{}sendMessage msg :: {}", COMMON_LOG, msg);

		return msg;
	}

}
