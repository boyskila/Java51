package com.hackbulgaria51.week7.functioncallsextendedvariant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Function {
	private static Map<String, Function> functionsCollection = new HashMap<>();
	private int argument;
	private int result;
	private String expression;

	Function(String expression) {
		this.expression = expression;
	}

	private int calculateValue(String argument) {
		if (argument.matches("[0-9]+")) {
			return Integer.parseInt(argument);
		}
		String[] name = argument.split("\\(");
		Function function = functionsCollection.get(name[0]);
		// extract the digit between brackets -> example sin(5) get 5
		argument = argument.replaceAll("\\D+", "");
		function.argument = Integer.parseInt(argument);
		return function.calculateFunction();
	}

	public int calculateFunction() {
		String[] functionBody = expression.replaceAll("x", argument + "")
				.split(" ");
		for (int index = 3; index < functionBody.length; index++) {
			String value = functionBody[index];
			if (value.equals("+") || value.equals("-")) {
				int valueAfter = calculateValue(functionBody[++index]);
				result = value.equals("+") ? result + valueAfter : result
						- valueAfter;
				continue;
			}
			result = calculateValue(value);
		}
		return result;
	}

	public static int functionCalls(String[] array, int argument) {
		Function currentFunction = null;
		for (int i = array.length - 1; i >= 0; i--) {
			currentFunction = functionsCollection.get(array[i]);
			currentFunction.argument = argument;
			argument = currentFunction.calculateFunction();
		}
		return currentFunction.result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFunctions = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfFunctions; i++) {
			String expression = sc.nextLine();
			int index = expression.indexOf(' ');
			String name = expression.substring(0, index);
			functionsCollection.put(name, new Function(expression));
		}
		String[] composition = sc.nextLine().split(" . ");
		int argument = sc.nextInt();
		System.out.println(functionCalls(composition, argument));
		sc.close();
	}
}