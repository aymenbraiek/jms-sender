package com.biat.messaging.jmssender.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="biat.jms")
public class JMSProperties {
	
	private String queue;
	private String rateQueue;
	private String rateReplyQueue;
	private String topic;

	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getRateQueue() {
		return rateQueue;
	}
	public void setRateQueue(String rateQueue) {
		this.rateQueue = rateQueue;
	}
	public String getRateReplyQueue() {
		return rateReplyQueue;
	}
	public void setRateReplyQueue(String rateReplyQueue) {
		this.rateReplyQueue = rateReplyQueue;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "JMSProperties [queue=" + queue + ", rateQueue=" + rateQueue + ", rateReplyQueue=" + rateReplyQueue
				+ ", topic=" + topic + "]";
	}
	

}
