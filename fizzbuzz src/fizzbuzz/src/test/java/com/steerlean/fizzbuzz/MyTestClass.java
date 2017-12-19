package com.steerlean.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;

public class MyTestClass {

	@Test
	public void testDivisibilityRule() {
		//Arrange
		int divisor=3;
		String processedString= "Fizz";
		DivisibilityRule test= new DivisibilityRule(divisor, processedString);
		//Act

		for(int input=0;input<100;input+=3) {
			String result = test.parse(input);
			//Assert
			Assert.assertEquals(result, "Fizz");
		}
	}

	@Test(expectedExceptions=ArithmeticException.class)
	public void testDivisibilityRuleForDivisorZero() {
		//Arrange
		int input=45;
		int divisor=0;
		String processedString= "Fizz";
		DivisibilityRule test= new DivisibilityRule(divisor, processedString);
		//Act
		String result = test.parse(input);
		//Assert
		//Assert.assertEquals(result, "Fizz");
	}

	@Test
	public void testDivisibilityRuleNonDividibleNumber() {
		//Arrange
		int input=45;
		int divisor=2;
		String processedString= "Fizz";
		DivisibilityRule test= new DivisibilityRule(divisor, processedString);
		//Act
		String result = test.parse(input);
		//Assert
		Assert.assertEquals(result,"");
	}

}
