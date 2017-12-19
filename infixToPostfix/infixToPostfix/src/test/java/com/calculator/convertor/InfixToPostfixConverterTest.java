package com.calculator.convertor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InfixToPostfixConverterTest {
	
	private InfixToPostfixConverter converter;
	
	@Before
	public void setup() {
		converter = new InfixToPostfixConverter();
	}

	@Test
	public void testPostfixOfEmptyListIsEmpty() 
    {
        List<String> infixTokens = new ArrayList<String>();
        List<String> postfixTokens = converter.convert(infixTokens);
        
        Assert.assertTrue(postfixTokens.isEmpty());
    }
	
	@Test
	public void testPostfixOfSingleOperationWorks()
    {
        List<String> actualPostfixTokens = converter.convert(new ArrayList<String>(Arrays.asList("2", "+", "2")));
		ArrayList<String> expectedPostfixTokens = new ArrayList<String>(Arrays.asList("2", "2", "+"));
		
		Assert.assertEquals(expectedPostfixTokens, actualPostfixTokens);
    }
	
	@Test
	public void testPostfixOfMultipleperationWorks()
    {
        List<String> actualPostfixTokens = converter.convert(new ArrayList<String>(Arrays.asList("2", "+", "3", "-", "4")));
		ArrayList<String> expectedPostfixTokens = new ArrayList<String>(Arrays.asList("2", "3", "4", "-", "+"));
		
		Assert.assertEquals(expectedPostfixTokens, actualPostfixTokens);
    }
	
	@Test
	public void testPostfixWithOperatorPrecedence()
    {
        List<String> actualPostfixTokens = converter.convert(new ArrayList<String>(Arrays.asList("2", "*", "3", "+", "4")));
		ArrayList<String> expectedPostfixTokens = new ArrayList<String>(Arrays.asList("2", "3", "*", "4", "+"));
		
		Assert.assertEquals(expectedPostfixTokens, actualPostfixTokens);
    }
	
	@Test
	public void testPostfixWithPowerPrecedence()
    {
        List<String> actualPostfixTokens = converter.convert(new ArrayList<String>(Arrays.asList("2", "+", "3", "^", "4","*","5")));
		ArrayList<String> expectedPostfixTokens = new ArrayList<String>(Arrays.asList("2", "3", "4", "^", "5","*","+"));
		
		Assert.assertEquals(expectedPostfixTokens, actualPostfixTokens);
    }
}
