package com.hackbulgaria51.week7.functioncallsextended;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Parser {

	public static Vector<Function> functionsCollection = new Vector<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfFunctions = Integer.parseInt(sc.nextLine());
		Vector<String> functions = new Vector<>();
		for (int i = 0; i < numberOfFunctions; i++) {
			String function = sc.nextLine();
			functions.add(function);
		}
		Stack<String> stack = new Stack<>();
		// put composition in stack
		String[] composition = sc.nextLine().split(" . ");
		for (int i = 0; i < composition.length; i++) {
			stack.push(composition[i]);
		}
		// build and calculate functions from passed string and argument
		int argument = sc.nextInt();
		for (int i = 0; i < functions.size(); i++) {
			functionsCollection.add(new Function(functions.get(i), argument));
			functionsCollection.get(i).calculateFunction();
		}
		// send composition to Function class
		System.out.println(new Function().call(stack));
		sc.close();
	}
}