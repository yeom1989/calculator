package com.okdevtv.tdd.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	//test add
	@Test
	public void test() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1,2);
		assertEquals(3, result);
	}
	//testSubtract
	
	//testMultiply
	
	//testDivide
	

}
