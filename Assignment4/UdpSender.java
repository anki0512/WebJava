package com.sunbeam;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class UdpSender implements Sender {

	@Override
	public void send(double value) {
		System.out.println("UdpSender : " + value);
		
	}

}
