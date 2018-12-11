package com.mahdi.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//this annotation tells SpringBoot that this is the starting point of the application
public class MyApp {
	
	/**
	 * ***&Starting spring boot*****
	 *	sets up default configuratio
	 *	sets up spring application context
	 *	perform class path scan
	 *	starts tomcat server
	 * *************************************
	 * *************************************
	 * 
	 * This method tells spring boot to start the application
	 * create a servlet container
	 * host the app in that servlet container
	 * @param args
	 */
	public static void main(String[] args) {
		//static method run do all the three steps mentioned in the upper part
		SpringApplication.run(MyApp.class, args);
	}
}
