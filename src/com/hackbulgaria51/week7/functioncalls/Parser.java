package com.hackbulgaria51.week7.functioncalls;
import java.util.Scanner;
import java.util.Stack;

public class Parser {
	public static int f1(int x) {
		return f2(x) + f3(x);
	}

	public static int f2(int x) {
		return 2 * x;
	}

	public static int f3(int x) {
		return x + 1;
	}

	public static int f4(int x) {
		return 2 * f1(x);
	}

	public static int evaluate(String formula, int x) {
		String[] splited = formula.split(" . ");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < splited.length; i++) {
			stack.push(splited[i]);
		}
		while (!stack.isEmpty()) {
			x = call(stack.pop(), x);
		}
		return x;
	}

	public static int call(String f, int x) {
		switch (f) {
		case "f1":
			return f1(x);
		case "f2":
			return f2(x);
		case "f3":
			return f3(x);
		case "f4":
			return f4(x);

		default:
			break;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int x = scanner.nextInt();
		System.out.println(evaluate(input, x));
		scanner.close();
	}
}
