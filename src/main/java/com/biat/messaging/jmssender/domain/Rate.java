package com.biat.messaging.jmssender.domain;

import java.util.Date;

public class Rate {
	private String code;
	private Float rate;
	private Date date;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Rate [code=" + code + ", rate=" + rate + ", date=" + date + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public Rate(String code, Float rate, Date date) {
		super();
		this.code = code;
		this.rate = rate;
		this.date = date;
	}
	public Rate() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
