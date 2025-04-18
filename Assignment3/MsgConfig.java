package com.sunbeam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MsgConfig {
	
	
	@Primary
	@Bean
	public Sender s1() {
		Sender obj=new HTTPSender();
		return obj;
	}
	@Bean
	public Sender s2() {
		Sender obj=new TCPSender();
		return obj;
	}
	@Bean
	public Sender s3() {
		Sender obj=new UDPSender();
		return obj;
	}
	}
