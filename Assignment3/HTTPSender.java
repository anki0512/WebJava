package com.sunbeam;

import org.springframework.stereotype.Component;

@Component
public class HTTPSender implements Sender {


	@Override
	public void send(Double value) {
		System.out.println("HTTPSender");

		
	}
	

}
