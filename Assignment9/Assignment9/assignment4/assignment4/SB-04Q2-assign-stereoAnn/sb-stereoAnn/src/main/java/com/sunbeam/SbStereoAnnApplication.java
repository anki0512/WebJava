package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.bank.Account;
import com.bank.ConsoleLoggerImpl;
import com.bank.FileLoggerImpl;
import com.bank.Logger;
import com.bank.TestSpEL;


@ComponentScan("com.bank")
@SpringBootApplication
public class SbStereoAnnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbStereoAnnApplication.class, args);
	}
    
	@Autowired
	private ApplicationContext ctx;
	
	@Override
	public void run(String... args) throws Exception {

//		Logger consLogger = ctx.getBean(ConsoleLoggerImpl.class);
//		
//		Logger fileLogger = ctx.getBean(FileLoggerImpl.class);
//		
//		Logger logger = ctx.getBean(Logger.class);  
//		
		Account acc = ctx.getBean(Account.class);
		System.out.println(acc);
		acc.deposit(3000);
		System.out.println(acc);
		
		TestSpEL test = ctx.getBean(TestSpEL.class);
		test.display();
		
	}
}
