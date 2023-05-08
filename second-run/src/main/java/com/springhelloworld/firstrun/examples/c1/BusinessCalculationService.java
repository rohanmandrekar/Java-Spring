package com.springhelloworld.firstrun.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	private DataService dataService;
	
	
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findmax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
