package com.okdevtv.tdd.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	//test add
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1,2);
		assertEquals(3, result);
	}
	//testSubtract
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(1,2);
		assertEquals(-1, result);
	}
	//testMultiply
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(1,2);
		assertEquals(2, result);
	}
	
	//testDivide
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(1,2);
		assertEquals(0, result);
	}
	

}
