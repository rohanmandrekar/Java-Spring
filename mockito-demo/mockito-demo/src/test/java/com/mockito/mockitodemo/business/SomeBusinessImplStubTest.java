package com.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void testFindGreatestFromAllData() {
		DataService dataServiceStub= new DataServiceStub1();
		SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceStub);
		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void testFindGreatestFroOneValue() {
		DataService dataServiceStub= new DataServiceStub2();
		SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataServiceStub);
		assertEquals(35, businessImpl.findTheGreatestFromAllData());
	
}


class DataServiceStub1 implements DataService{
	@Override
	public int[] retrieveAllData() {
		
		return new int[] {25,15,5};
	}
	
}

class DataServiceStub2 implements DataService{
	@Override
	public int[] retrieveAllData() {
		
		return new int[] {35};
	}
}	
}