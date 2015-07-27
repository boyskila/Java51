package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Stack;
import java.util.Vector;

public class Function {
	private String name;
	private String[] function;
	private int argument;
	private int result;
	private Vector<Function> allFunctions;

	Function(int argument) {
		this.argument = argument;
		allFunctions = Parser.functionsCollection;
	}

	Function(String expression) {
		// get all created functions
		allFunctions = Parser.functionsCollection;
		function = expression.split("=");
		// get function name
		String[] n = function[0].split(" ");
		name = n[0];
	}

	private int calculateValue(String argument) {
		if (argument.matches("[0-9]+")) {
			return Integer.parseInt(argument);
		}
		for (Function function : allFunctions) {
			// if "argument" is a function than calculate it using
			// calculateFunction() method
			if (argument.contains(function.name)) {
				argument = argument.replaceAll("\\D+", "");// extract the digit
				function.argument = Integer.parseInt(argument);
				function.calculateFunction();
				return function.result;
			}
		}
		return Integer.parseInt(argument);
	}

	public int calculateFunction() {
		String[] functionBody = function[1].replaceAll("x", argument + "")
				.split(" ");
		// calculate the body
		for (int i = 1; i < functionBody.length; i++) {
			String valueBefore = functionBody[i];
			if (!valueBefore.equals("+") && !valueBefore.equals("-")) {
				// get value before the sign
				result = calculateValue(valueBefore);
			} else {
				// get value after the sign
				int valueAfter = calculateValue(functionBody[i + 1]);
				result = valueBefore.equals("+") ? result + valueAfter
						: result - valueAfter;
				i++;
			}
		}
		return result;
	}

	public int functionCalls(Stack<String> stack) {
		int size = allFunctions.size();
		int currentFunctionArgument = argument;
		Function currentFunction = null;
		while (!stack.isEmpty()) {
			String functionName = stack.pop();
			for (int i = 0; i < size; i++) {
				currentFunction = allFunctions.get(i);
				// give argument to the currentFunction
				currentFunction.argument = currentFunctionArgument;
				if (currentFunction.name.contains(functionName)) {
					currentFunctionArgument = currentFunction
							.calculateFunction();
					break;
				}
			}
		}
		return currentFunction.result;
	}
}