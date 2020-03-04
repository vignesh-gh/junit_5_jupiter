package com.vignesh.jupiter_junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicMathsTest {
	BasicMaths basicMaths=new BasicMaths();
	@Test
	void test() {
		addNumberTest();
		subtractNumberTest();
				
	}
	
	public void addNumberTest() {
		int expected=2;
		int actual=basicMaths.addNumber(1, 1);
		assertEquals(expected, actual);
	}
	
	public void subtractNumberTest() {
		int expected=0;
		int actual=basicMaths.subtractNumber(1, 1);
		assertEquals(expected, actual);
	}
}
