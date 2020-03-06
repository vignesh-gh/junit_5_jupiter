package com.vignesh.jupiter_junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class BasicMathsTest {
	
	TestInfo testInfo;
	TestReporter testreporter;
	
	BasicMaths basicMaths;
	
	@BeforeEach
	void init(TestInfo testIn,TestReporter tr){
		this.testInfo=testIn;
		this.testreporter=tr;
		basicMaths=new BasicMaths();
		
		
		
		
	}

	/*
	 * @Test
	 * 
	 * @DisplayName("adding Two numbers") public void addNumberTest() { boolean
	 * serverUp=true; assumeTrue(serverUp); assertAll( ()->assertEquals(2,
	 * basicMaths.addNumber(1,1)), ()->assertEquals(0,basicMaths.addNumber(0, 0)),
	 * ()->assertEquals(10,basicMaths.addNumber(1, 9)) ); }
	 */	
	
	@Nested
	@Tag("Development")
	@DisplayName("Adding Number Test cases")
	public class Addtestclass{
		
		@Test
		@DisplayName("Adding postive number")
		public void postiveNumberTest() {
			assertEquals(2,basicMaths.addNumber(1, 1));
		}
		
		@Test
		@DisplayName("Adding negative number")
		public void negativeNumberTest() {
			assertEquals(-2,basicMaths.addNumber(-1, -1));
		}
		
	}

	@Test
	@Tag("Development")
	@DisplayName("Testing subtract method")
	public void subtractNumberTest() {
		
		int expected=0;
		int actual=basicMaths.subtractNumber(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	@Tag("Production")
	public void findCircleAreaTest(TestInfo testInfo,TestReporter testReporter) {

		assertEquals(314.0,basicMaths.findCircleArea(10),"should calculate circle area");
	}
	
	
	  @Test	  
	  @RepeatedTest(3) 
	  @Disabled
	  @Tag("Production")
	  public void throwAException(RepetitionInfo rinfo) {
	  System.out.println(rinfo.getCurrentRepetition());
	  assertThrows(ArithmeticException.class, ()->
	  basicMaths.divide(5,0),"should throw Arithmetic Exception"); }
	 
	
}
