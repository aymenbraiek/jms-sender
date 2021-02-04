package com.biat.messaging.jmssender;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.biat.messaging.jmssender.config.JMSProperties;
import com.biat.messaging.jmssender.jms.SimpleSender;

@SpringBootApplication
public class JmsSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsSenderApplication.class, args);
	}

	@Bean
	 CommandLineRunner simple(JMSProperties props,SimpleSender sender){
	 return args -> { sender.sendMessage(props.getQueue(), "Hello World");
	 };
	 }
}
