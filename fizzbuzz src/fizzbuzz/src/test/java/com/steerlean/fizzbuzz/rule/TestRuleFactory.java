package com.steerlean.fizzbuzz.rule;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;



public class TestRuleFactory {
	
  @Test
  public void testcreateSumOfDigitsDivisibility() {
	  //Arrange
	  RuleFactory rfactory= new RuleFactory();
	  int divisor=3;
	  String processedString= "Fizz";
	  //Act
	  IRule result= rfactory.createSumOfDigitsDivisibility(divisor,processedString);
	  
	  //Assert
	// assert.assertTrue(result.equals(new SumOfDigitsDivisibility(5, processedString)));
	 SumOfDigitsDivisibility expectedObj = new SumOfDigitsDivisibility(3, processedString);
	 Assert.assertTrue(result.equals(expectedObj));
  }
}
