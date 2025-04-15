
package com.sunbeam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArithmeticConfig {
	
	@Bean
	public Arithmetic b1() {
		Arithmetic a = new Arithmetic();
		a.setNum1(5);
		a.setNum2(5);
		
		return a;
	}
	
	@Bean
	public Arithmetic b2() {
		Arithmetic a1 = new Arithmetic(10, 20);
		return a1;
	}
	
	

}
