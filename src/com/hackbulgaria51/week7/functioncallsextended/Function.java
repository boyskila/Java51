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
		func = Parser.functionsCollection;
		this.argument = argument;
		function = expression.replaceAll("x", argument + "").split("=");
		String[] n = this.function[0].split(" ");
		name = n[0];
	}

	private int calculateInnerFunction(String str) {
		for (Function function : func) {
			if (str.contains(function.name)) {
				str = str.replaceAll("\\D+", "");
				function.argument = Integer.parseInt(str);
				function.calculateFunction();
				return function.result;
			}
		}
		return Integer.parseInt(str);
	}

	public int calculateFunction() {
		function = tempFunction;
		String[] functionBody = function[1].replaceAll("x", argument + "")
				.split(" ");
		for (int i = 1; i < functionBody.length; i++) {
			String index = functionBody[i];
			if (!index.equals("+") && !index.equals("-")) {
				int index1 = calculateInnerFunction(index);
				result = index1;
			} else {
				int nextIndex = calculateInnerFunction(functionBody[i + 1]);
				int number = nextIndex;
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
			String str = stack.pop();
			for (int i = 0; i < size; i++) {
				Function f = func.get(i);
				if (f.name.contains(str)) {
					if (counter > 0) {
						f.argument = currentFunctionArgument;
						// calculate function everytime with the new argument
						currentFunctionArgument = f.calculateFunction();
						result = f.result;
						break;
					} else {
						// pass result from the first choosen function
						currentFunctionArgument = f.result;
					}
				}
			}
			counter++;
		}
		return result;
	}

	public String toString() {
		return name;
	}
}