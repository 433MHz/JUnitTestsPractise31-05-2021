package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

}
