 package com.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class AccountImpl implements Account {
	private int id;
	private String type;
	private double balance;
	@Qualifier("fileLoggerImpl")
	@Autowired 
	private Logger logger;
	public AccountImpl() {
	
	}
	
	public AccountImpl(int id, String type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
		this.logger = null;
	}

	public AccountImpl(int id, String type, double balance, Logger logger) {
		this.id = id;
		this.type = type;
		this.balance = balance;
		this.logger = logger;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public String toString() {
		return "AccountImpl [id=" + id + ", type=" + type + ", balance=" + balance + "]";
	}
	
	@Override
	public void deposit(double amount) {
		if(logger != null)
			logger.log("Deposit Rs. " + amount +"/- into account " + this.id);
		this.balance = this.balance + amount;
	}
	
	@Override
	public void withdraw(double amount) {
		if(logger != null)
			logger.log("Withdraw Rs. " + amount +"/- from account " + this.id);
		this.balance = this.balance - amount;		
	}
}
