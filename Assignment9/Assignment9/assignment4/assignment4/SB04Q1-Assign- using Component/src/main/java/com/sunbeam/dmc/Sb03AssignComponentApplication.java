package com.sunbeam.dmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sb03AssignComponentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Sb03AssignComponentApplication.class, args);
		
	}
		@Autowired
		private ApplicationContext ctx;
		
	

	@Override
	public void run(String... args) throws Exception {
		TcpSender ts = ctx.getBean(TcpSender.class);
		ts.Send(400);
		
		UdpSender us = ctx.getBean(UdpSender.class);
		us.Send(450.3);
		
	    HttpsSender hs = ctx.getBean(HttpsSender.class);
	    hs.Send(455.4);
		
		
		
	}

}
