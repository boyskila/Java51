package com.hackbulgaria51.week7.functioncallsoop;

public class Function {
	private static FunctionsCollection functionsCollection;
	private int argument;
	private int result;
	private String expression;

	public Function(FunctionsCollection functionsCollection) {
		Function.functionsCollection = functionsCollection;
	}

	public Function(String expression) {
		this.expression = expression;
	}

	private int extractValue(Value value) {
		String argument = value.getValue();
		if (!value.isFunction()) {
			return Integer.parseInt(argument);
		}
		String[] name = argument.split("\\(");
		Function function = functionsCollection.getFunction(name[0]);
		function.argument = new Value(argument).extractValue();
		return function.calculateFunction();
	}

	public int calculateFunction() {
		Body body = new Body(expression, argument);
		while (!body.isCalculated()) {
			Value value = new Value(body.getBodyPart());
			if (value.isOperator()) {
				Value v = new Value(body.getBodyPart());
				int valueAfter = extractValue(v);
				result = value.doOperation(result, valueAfter);
				continue;
			}
			result = extractValue(value);
		}
		return result;
	}

	public int functionCalls(Composition array, int argument) {
		Function currentFunction = null;
		while (!array.isEmpty()) {
			currentFunction = functionsCollection.getFunction(array.getTop());
			currentFunction.argument = argument;
			argument = currentFunction.calculateFunction();
		}
		return currentFunction.result;
	}

	public String toString() {
		return expression;
	}
}
