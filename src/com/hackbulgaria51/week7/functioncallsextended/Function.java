package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Stack;
import java.util.Vector;

public class Function {
	private String name;
	private String[] function;
	private String[] tempFunction;
	private int argument;
	private int result;
	private Vector<Function> func;

	Function() {
		func = Parser.functionsCollection;
	}

	Function(String expression, int argument) {
		tempFunction = expression.split("=");
		// get all created functions
		func = Parser.functionsCollection;
		this.argument = argument;
		function = expression.split("=");
		// get function name
		String[] n = function[0].split(" ");
		name = n[0];
	}

	private int calculateInnerFunction(String argument) {
		for (Function function : func) {
			// if "argument" is a function than calculate it using
			// calculateFunction() method
			if (argument.contains(function.name)) {
				argument = argument.replaceAll("\\D+", "");
				function.argument = Integer.parseInt(argument);
				function.calculateFunction();
				return function.result;
			}
		}
		// if "argument" is a number just return it back
		return Integer.parseInt(argument);
	}

	public int calculateFunction() {
		function = tempFunction;
		// split body and replace "X" with the argument
		String[] functionBody = function[1].replaceAll("x", argument + "")
				.split(" ");
		for (int i = 1; i < functionBody.length; i++) {
			String index = functionBody[i];
			if (!index.equals("+") && !index.equals("-")) {
				result = calculateInnerFunction(index);
			} else {
				int number = calculateInnerFunction(functionBody[i + 1]);
				result = index.equals("+") ? result + number : result - number;
				i++;
			}
		}
		return result;
	}

	public int call(Stack<String> stack) {
		int size = func.size();
		int currentFunctionArgument = 0;
		int result = 0;
		int counter = 0;
		while (!stack.isEmpty()) {
			String functionName = stack.pop();
			for (int i = 0; i < size; i++) {
				Function currentFunction = func.get(i);
				if (currentFunction.name.contains(functionName)) {
					if (counter > 0) {
						// calculate function everytime with the newest argument
						currentFunction.argument = currentFunctionArgument;
						currentFunctionArgument = currentFunction
								.calculateFunction();
						result = currentFunction.result;
						break;
					} else {
						// program entered here just once
						// and pass the result from the first choosen function
						// this will be the first argument
						currentFunctionArgument = currentFunction.result;
						break;
					}
				}
			}
			counter++;
		}
		return result;
	}
}