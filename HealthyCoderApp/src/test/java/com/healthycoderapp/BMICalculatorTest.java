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
	
	@Test
	void check_if_return_is_true() {
//		given
		double weight = 95;
		double height = 1.72;
		
//		when
		boolean isRecomended = BMICalculator.isDietRecommended(weight, height);
		
//		then
		assertEquals(true, isRecomended);
		
	}
	
	@Test
	void return_true_when_diet_recomended_and_false_when_not() {
//		given
		double firstWeight = 95;
		double firstHeight = 1.72;
		
		double secondWeight = 70;
		double secondHeight = 1.72;
		
//		when
		boolean isFirstRecomended = BMICalculator.isDietRecommended(firstWeight, firstHeight);
		boolean isSecondRecomended = BMICalculator.isDietRecommended(secondWeight, secondHeight);
		
//		then
		assertAll(
				() -> assertTrue(isFirstRecomended),
				() -> assertFalse(isSecondRecomended));
		
	}
}
