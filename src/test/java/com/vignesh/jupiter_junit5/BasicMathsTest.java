package com.vignesh.jupiter_junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class BasicMathsTest {
	
	BasicMaths basicMaths;
	
	@BeforeEach
	void init(){
		basicMaths=new BasicMaths();
	}

	@Test
	@DisplayName("adding Two numbers")
	public void addNumberTest() {
		boolean serverUp=true;
		assumeTrue(serverUp);
		assertAll(
			()->assertEquals(2, basicMaths.addNumber(1,1)),
			()->assertEquals(0,basicMaths.addNumber(0, 0)),
			()->assertEquals(10,basicMaths.addNumber(1, 9))	
				);
	}	

	@Test
	@DisplayName("Testing subtract method")
	public void subtractNumberTest() {
		
		int expected=0;
		int actual=basicMaths.subtractNumber(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void findCircleAreaTest() {
		
		assertEquals(314.0,basicMaths.findCircleArea(10),"should calculate circle area");
	}
	
	@Test
	@Disabled
	public void throwAException() {
		
		assertThrows(ArithmeticException.class, ()-> basicMaths.divide(5,0),"should throw Arithmetic Exception");
	}
	
	
}
