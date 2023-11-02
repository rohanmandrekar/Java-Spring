package com.rohan.learnspringaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohan.learnspringaop.aopexample.business.BusinessService1;
import com.rohan.learnspringaop.aopexample.business.BusinessService2;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {
	
	public BusinessService1 businessService1;
	public BusinessService2 businessService2;
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	

	public LearnSpringAopApplication(BusinessService1 businessService1,BusinessService2 businessService2) {
		super();
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;

	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Value returned is {}", businessService1.calculateMax());
		logger.info("Value returned is {}", businessService2.calculateMin());
		
	}

}
