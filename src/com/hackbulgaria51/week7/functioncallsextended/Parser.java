package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Parser {
	public static Vector<Function> functionsCollection = new Vector<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFunctions = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfFunctions; i++) {
			String function = sc.nextLine();
			functionsCollection.add(new Function(function));
		}
		Stack<String> stack = new Stack<>();
		// put composition in stack
		String[] composition = sc.nextLine().split(" . ");
		for (int i = 0; i < composition.length; i++) {
			stack.push(composition[i]);
		}
		int argument = Integer.parseInt(sc.nextLine());
		// send composition to Function class
		System.out.println(new Function(argument).functionCalls(stack));
		sc.close();
	}
}