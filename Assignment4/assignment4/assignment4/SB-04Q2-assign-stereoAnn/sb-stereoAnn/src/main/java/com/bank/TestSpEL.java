package com.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestSpEL {
	@Value("#{acc.id}")
	private int accId;
	@Value("#{acc.getBalance()}")
	private String accBalance;
	@Value("#{'bank' + 'saving'}")
	private String accType;
	
	public void display() {
		System.out.println("Acc id : " + accId);
		System.out.println("Acc balance : " + accBalance);
		System.out.println("Acc type : " + accType);
	}
}
