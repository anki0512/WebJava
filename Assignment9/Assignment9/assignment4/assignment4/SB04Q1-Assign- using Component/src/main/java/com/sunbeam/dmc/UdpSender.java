package com.sunbeam.dmc;

import org.springframework.stereotype.Component;

@Component
public class UdpSender implements Sender{

	@Override
	public void Send(double Value) {
	System.out.println("Udp value :" +Value);
		
	}

}
