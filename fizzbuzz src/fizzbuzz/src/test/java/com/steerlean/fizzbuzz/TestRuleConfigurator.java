package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;

import mockit.Expectations;
import mockit.Mocked;
import mockit.internal.expectations.*;

public class TestRuleConfigurator {

	@Mocked
	RuleFactory factory;

	@Test
	public void testConfigure() {
		//Arrange
		RulesConfigurator rConfigure = new RulesConfigurator(factory);
		List<IRule> expectedList = new ArrayList<IRule>();  
		
		new Expectations() {
			{
				
			}
		};


		//Act
		List<IRule> result = rConfigure.configure();

		//Assert
//Assert.asse
	
	}
}
