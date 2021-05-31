package com.healthycoderapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class BMICalculatorTest {

	@Test
	void shouldReturnTrueWhenDietRecommended() {
//		given
		double weight = 89;
		double height = 1.72;
		
//		when
		boolean recommended = BMICalculator.isDietRecommended(weight, height);
		
//		then
		assertTrue(recommended);
	}
	
	@Test
	void shouldReturnFalseWhenDietNotRecommended() {
//		given
		double weight = 50;
		double height = 1.92;
		
//		when
		boolean recommended = BMICalculator.isDietRecommended(weight, height);
		
//		then
		assertFalse(recommended);
	}
	
	@Test
	void shouldThrowArithmeticExceptionWhenHeightZero() {
		
//		given
		double weight = 50.0;
		double height = 0.0;
		
//		when
		Executable executable = () -> BMICalculator.isDietRecommended(weight, height);
		
//		then
		assertThrows(ArithmeticException.class, executable);
	}
}
