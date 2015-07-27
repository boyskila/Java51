package com.hackbulgaria51.week7.functioncallsextendedvariant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Parser {
	public static Map<String, Function> functionsCollection = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFunctions = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfFunctions; i++) {
			String function = sc.nextLine();
			int index = function.indexOf(' ');
			String name = function.substring(0, index);
			String rest = function.substring(index);
			functionsCollection.put(name, new Function(rest));
		}
		Stack<String> stack = new Stack<>();
		String[] composition = sc.nextLine().split(" . ");
		for (int i = 0; i < composition.length; i++) {
			stack.push(composition[i]);
		}
		int argument = Integer.parseInt(sc.nextLine());
		System.out.println(new Function(argument).functionCalls(stack));
		sc.close();
	}
}