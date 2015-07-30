package com.hackbulgaria51.week7.functioncallsoop;
public class Value {
	private String value;

	public Value(String value) {
		this.value = value;
	}

	public boolean isOperator() {
		return value.equals("+") || value.equals("-");
	}

	public boolean isFunction() {
		return !value.matches("[0-9]+");
	}

	public int extractValue() {
		value = value.replaceAll("\\D+", "");
		return Integer.parseInt(value);
	}

	public int doOperation(int result, int value) {
		switch (this.value) {
		case "+":
			return result + value;
		case "-":
			return result - value;
		default:
			return 0;
		}
	}

	public String getValue() {
		return value;
	}
}
