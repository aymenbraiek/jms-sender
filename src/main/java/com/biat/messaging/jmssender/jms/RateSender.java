package com.biat.messaging.jmssender.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import com.biat.messaging.jmssender.domain.Rate;

@Component
public class RateSender {
	
	private JmsTemplate jmsTemplate;
	 @Autowired
	 public RateSender(JmsTemplate jmsTemplate){
	 this.jmsTemplate = jmsTemplate;
	 }
	 /* send objet  Rate*/
	 public void sendCurrency(String destination, Rate rate){
	 this.jmsTemplate.convertAndSend(destination,rate);
	 }
}
