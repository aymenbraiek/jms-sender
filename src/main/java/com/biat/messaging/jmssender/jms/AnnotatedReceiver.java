package com.biat.messaging.jmssender.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedReceiver {
	
	@JmsListener(destination = "${biat.jms.queue}")
	 public void processMessage(String content) {
		
	 }
}
