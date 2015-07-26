package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Stack;
import java.util.Vector;

public class Function {
	private String name;
	private String[] function;
	private int argument;
	private int result;
	private Vector<Function> func;

	Function() {
		func = Parser.functionsCollection;
	}

	Function(String expression, int argument) {
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
				argument = argument.replaceAll("\\D+", "");// extract the digit
				function.argument = Integer.parseInt(argument);
				function.calculateFunction();
				return function.result;
			}
		}
		// if "argument" is a number just return it back
		return Integer.parseInt(argument);
	}

	public int calculateFunction() {
		// split the body and replace all "X" with the argument
		String[] functionBody = function[1].replaceAll("x", argument + "")
				.split(" ");
		// calculate the body
		for (int i = 1; i < functionBody.length; i++) {
			String numberBefore = functionBody[i];
			if (!numberBefore.equals("+") && !numberBefore.equals("-")) {
				result = calculateInnerFunction(numberBefore);
			} else {
				// number after the sign
				int numberAfter = calculateInnerFunction(functionBody[i + 1]);
				result = numberBefore.equals("+") ? result + numberAfter
						: result - numberAfter;
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
				// trying to find the function
				if (currentFunction.name.contains(functionName)) {
					if (counter > 0) {
						currentFunction.argument = currentFunctionArgument;
						// calculate function everytime with the newest argument
						currentFunctionArgument = currentFunction
								.calculateFunction();
						result = currentFunction.result;
						break;
					} else {
						/*
						 * program entered here just once and pass the result
						 * from the first choosen function as argument.This will
						 * be the first argument
						 */
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