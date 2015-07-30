package com.hackbulgaria51.week7.functioncallsoop;
import java.util.Scanner;

public class FunctionCalls {

	public void run() {
		FunctionsCollection f = new FunctionsCollection();
		Scanner sc = new Scanner(System.in);
		int numberOfFunctions = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfFunctions; i++) {
			String expression = sc.nextLine();
			int index = expression.indexOf(' ');
			String name = expression.substring(0, index);
			Function function = new Function(expression);
			f.addFunction(name, function);
		}
		Function fun = new Function(f);
		Composition composition = new Composition(sc.nextLine());
		int argument = sc.nextInt();
		System.out.println(fun.functionCalls(composition, argument));
		sc.close();
	}

	public static void main(String[] args) {
		new FunctionCalls().run();
	}
}
