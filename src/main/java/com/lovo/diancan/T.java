package com.lovo.diancan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lovo"})
public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(T.class, args);
		
	}

}
