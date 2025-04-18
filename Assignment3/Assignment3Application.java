package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment3Application implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(Assignment3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Sender obj =ctx.getBean(Sender.class);
		
		obj.send(45.67);
		
		
		
	}

}
