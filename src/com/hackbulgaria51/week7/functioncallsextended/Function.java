package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Vector;

public class Function {
	public String name;
	public String[] function;
	public String[] tempFunction;
	public int argument;
	public int result;
	private Vector<Function> func;
	private String str;

	Function(String str, int argument, Vector<Function> func) {
		tempFunction = str.split("=");
		this.str = str;
		this.func = func;
		this.argument = argument;
		function = str.replaceAll("x", argument + "").split("=");
		String[] n = this.function[0].split(" ");
		name = n[0];
	}

	public String calculateInnerFunction(String str) {
		for (Function function : func) {
			if (str.contains(function.name)) {
				str = str.replaceAll("\\D+", "");
				function.function = function.str.replaceAll("x", str + "")
						.split("=");
				function.argument = Integer.parseInt(str);
				function.calculateFunction();
				str = function.result + "";
			}
		}
		return str;
	}

	public int calculateFunction() {
		function = tempFunction;
		String[] s = function[1].replaceAll("x", argument + "").split(" ");

		result = 0;
		for (int i = 1; i < s.length; i++) {
			String str = s[i];
			str = calculateInnerFunction(str);
			if (!str.equals("+") && !str.equals("-") && i < 2) {
				result = Integer.parseInt(str);
			} else {
				if (str.equals("+")) {
					String s1 = calculateInnerFunction(s[i + 1]);
					result += Integer.parseInt(s1);
					i++;
				} else {
					String s2 = calculateInnerFunction(s[i + 1]);
					result -= Integer.parseInt(s2);
					i++;
				}
			}
		}
		return result;
	}

	public String toString() {
		return name;
	}
}
