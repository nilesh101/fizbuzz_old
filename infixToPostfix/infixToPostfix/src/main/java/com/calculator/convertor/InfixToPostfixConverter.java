package com.calculator.convertor;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfixConverter {

	public List<String> convert(List<String> tokens) {
		Stack<String> operatorStack = new Stack<String>();
		List<String> postfixList = new ArrayList<String>();

		if (tokens.size() == 0) {
			return new ArrayList<String>();
		}
		String stackTop = null;

		for (String token : tokens) {
			if (token == "+" || token == "-" || token == "*" || token == "/" || token == "^") {
				while (true) {
					if (operatorStack.size() == 0) {
						break;
					}
					 stackTop = operatorStack.peek();
					if ((token == "+" || token == "-")
							&& (stackTop == "*" || stackTop == "/") ){
						postfixList.add(stackTop);
						operatorStack.pop();
					} 
					else if(token == "^")
					{
						operatorStack.add(token);
					}
					else {
						break;
					}
				}
				operatorStack.push(token);
			} else {
				postfixList.add(token);
				if(stackTop == "^")
					postfixList.add(stackTop);
			}
		}
		while (operatorStack.size() > 0) {
			postfixList.add(operatorStack.pop());
		}
		return postfixList;
	}
}
