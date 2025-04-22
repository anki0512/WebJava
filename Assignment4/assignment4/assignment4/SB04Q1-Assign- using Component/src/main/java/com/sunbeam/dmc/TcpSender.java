package com.sunbeam.dmc;

import org.springframework.stereotype.Component;

@Component
public class TcpSender implements Sender {

	
	public void Send(double Value) {
		System.out.println("Tcp Value :" +Value);
		
	}

}
