package com.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String> todos= Arrays.asList("AWS","Azure");
	@Test
	void test() {
		boolean test= todos.contains("AWS");
		assertEquals(true,test,"something went wronng"); 
		assertTrue(test,"something went wrong");
		assertFalse(todos.contains("gscp"));
		assertEquals(2,todos.size());
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}

}
