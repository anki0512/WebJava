package com.sunbeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Assignment21Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment21Application.class, args);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ArithmeticConfig.class);
		Arithmetic b1 = (Arithmetic)ctx.getBean("b1");
		System.out.println(b1.add());
		System.out.println(b1.multiply());
		System.out.println(b1.subtract());
		System.out.println(b1.divide());
		
		
		Arithmetic b2 = (Arithmetic)ctx.getBean("b2");
		System.out.println(b2.add());
		System.out.println(b2.multiply());
		System.out.println(b2.subtract());
		System.out.println(b2.divide());
		
		
		ctx.close();
	}

}
