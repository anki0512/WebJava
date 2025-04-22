package com.sunbeam.dmc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component

public class HttpsSender implements Sender {

	@Override
	public void Send(double Value) {
		System.out.println("Https Value :" +Value);
		
	}

}
