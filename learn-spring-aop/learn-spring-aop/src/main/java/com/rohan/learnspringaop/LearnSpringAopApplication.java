package com.rohan.learnspringaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohan.learnspringaop.aopexample.business.BusinessService1;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {
	
	public BusinessService1 businessService1;
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	

	public LearnSpringAopApplication(BusinessService1 businessService1) {
		super();
		this.businessService1 = businessService1;

	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Value returned is {}", businessService1.calculateMax());
		
	}

}
