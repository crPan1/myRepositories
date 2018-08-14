package com.pug.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	/*
	 * 发送消息
	 */
	public void send(String msg) {
		amqpTemplate.convertAndSend("hello-queue", "helloworld");
	}
}
