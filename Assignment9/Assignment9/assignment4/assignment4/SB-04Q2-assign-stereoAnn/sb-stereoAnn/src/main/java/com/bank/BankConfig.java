package com.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.bank")
@Configuration
public class BankConfig {

	@Bean
	public Account acc() {
		AccountImpl a = new AccountImpl(51, "Pratham", 45000.0);
		return a;
	}
	
}
