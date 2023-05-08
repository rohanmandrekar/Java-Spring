package com.springhelloworld.firstrun.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MongoDBdataservice implements DataService{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5,6};
	}

}
