package com.example.demo;

import com.example.demo.send.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	JmsTemplate jmsTemplate;

	@Override
	public void run(String... strings) throws Exception {
		jmsTemplate.send("myMessage",new Msg());
	}
}
