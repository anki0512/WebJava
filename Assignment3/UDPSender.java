package com.sunbeam;

import org.springframework.stereotype.Component;

@Component
public class UDPSender implements Sender {
	
	

	@Override
	public void send(Double value) {
		System.out.println("UDPSender");
		
	}
	
}
