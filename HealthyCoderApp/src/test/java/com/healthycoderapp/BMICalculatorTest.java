package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BMICalculatorTest {

	@Test
	void return_true_if_diet_is_recomended() {
//		given
		double weight = 85.0;
		double height = 1.72;
		
//		when
		boolean isRecomended = BMICalculator.isDietRecommended(weight, height);
		
//		then
		assertTrue(isRecomended);
	}

	
	@Test
	void return_false_if_diet_is_not_recomended() {
//		given
		double weight = 70.0;
		double height = 1.72;
		
//		when
		boolean isRecomended = BMICalculator.isDietRecommended(weight, height);
		
//		then
		assertFalse(isRecomended);
		
	}
}
