package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math= new MyMath();
	@Test
	void calculateSum_FourNumberArray() {
		assertEquals(10,math.calculateSum(new int[] {1,2,3,4}));
	}
	
	@Test
	void calculateSum_emptyArray() {
		assertEquals(0,math.calculateSum(new int[] {}));
	}
	
}
