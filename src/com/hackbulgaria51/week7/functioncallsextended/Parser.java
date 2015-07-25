package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Parser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFunctions = Integer.parseInt(sc.nextLine());
		Vector<String> functions = new Vector<>();
		Vector<Function> func = new Vector<>();
		for (int i = 0; i < numberOfFunctions; i++) {
			String function = sc.nextLine();
			functions.add(function);
		}
		Stack<String> stack = new Stack<>();
		String[] composition = sc.nextLine().split(" . ");
		for (int i = 0; i < composition.length; i++) {
			stack.push(composition[i]);
		}
		int functionArgument = sc.nextInt();
		for (int i = 0; i < functions.size(); i++) {
			func.add(new Function(functions.get(i), functionArgument, func));
			func.get(i).calculateFunction();
		}
		int size = func.size();
		int arg = 0;
		int result = 0;
		int counter = 0;
		while (!stack.isEmpty()) {
			String str = stack.pop();
			for (int i = 0; i < size; i++) {
				Function f = func.get(i);
				if (f.name.contains(str)) {
					if (counter > 0) {
						f.argument = arg;
						arg = f.calculateFunction();
					} else {
						arg = f.result;
					}
					result = f.result;
				}
			}
			counter++;

		}
		System.out.println(result);

	}
}
