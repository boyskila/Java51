package com.hackbulgaria51.week7.functioncallsextendedvariant;

import java.util.Map;
import java.util.Stack;

public class Function {
	private String[] function;
	private int argument;
	private int result;
	private Map<String, Function> functionsCollection;;

	Function(int argument) {
		functionsCollection = Parser.functionsCollection;
		this.argument = argument;
	}

	Function(String expression) {
		functionsCollection = Parser.functionsCollection;
		function = expression.split("=");
	}

	private int calculateValue(String argument) {
		if (argument.matches("[0-9]+")) {
			return Integer.parseInt(argument);
		}
		String[] name = argument.split("\\(");
		Function function = functionsCollection.get(name[0]);
		argument = argument.replaceAll("\\D+", "");// extract the digit
		function.argument = Integer.parseInt(argument);
		function.calculateFunction();
		return function.result;
	}

	public int calculateFunction() {
		String[] functionBody = function[1].replaceAll("x", argument + "")
				.split(" ");
		for (int index = 1; index < functionBody.length; index++) {
			String valueBefore = functionBody[index];
			if (!valueBefore.equals("+") && !valueBefore.equals("-")) {
				result = calculateValue(valueBefore);
			} else {
				int valueAfter = calculateValue(functionBody[index + 1]);
				result = valueBefore.equals("+") ? result + valueAfter : result
						- valueAfter;
				index++;
			}
		}
		return result;
	}

	public int functionCalls(Stack<String> stack) {
		int currentFunctionArgument = argument;
		Function currentFunction = null;
		while (!stack.isEmpty()) {
			String functionName = stack.pop();
			currentFunction = functionsCollection.get(functionName);
			currentFunction.argument = currentFunctionArgument;
			currentFunctionArgument = currentFunction.calculateFunction();
		}
		return currentFunction.result;
	}
}