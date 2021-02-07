package com.biat.messaging.jmssender;



import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.biat.messaging.jmssender.config.JMSProperties;
import com.biat.messaging.jmssender.domain.Rate;
import com.biat.messaging.jmssender.jms.RateSender;
import com.biat.messaging.jmssender.jms.SimpleSender;

@SpringBootApplication
public class JmsSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsSenderApplication.class, args);
	}

	@Bean
	 CommandLineRunner simple(JMSProperties props,SimpleSender sender){
		System.out.println("jms-queuee"+props.getQueue()+"jms rates"+props.getRateQueue()+" "+"jms rates replay"+" "+props.getRateReplyQueue()+"jms topic"+" "+props.getTopic());
	 return args -> { sender.sendMessage(props.getQueue(), "Hello World");
	 };
	 }
	
	@Bean
	CommandLineRunner process(JMSProperties props, RateSender sender){
		return args -> {
			sender.sendCurrency(props.getRateQueue(), new Rate("EUR",0.88857F,new Date()));
			sender.sendCurrency(props.getRateQueue(), new Rate("JPY",102.17F,new Date()));
			sender.sendCurrency(props.getRateQueue(), new Rate("MXN",19.232F,new Date()));
			sender.sendCurrency(props.getRateQueue(), new Rate("GBP",0.75705F,new Date()));
		};
	}
}
