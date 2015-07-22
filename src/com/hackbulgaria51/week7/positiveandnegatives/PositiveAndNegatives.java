package com.hackbulgaria51.week7.positiveandnegatives;

import java.util.Stack;

public class PositiveAndNegatives {
	public static Stack<Integer> reorder(int[] numbers) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				stack.push(numbers[i]);
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				stack.push(numbers[i]);
			}
		}
		return stack;
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, -10, -5, 8, -100 };
		Stack<Integer> result = reorder(n);

		while (!result.isEmpty()) {
			System.out.println(result.pop());
		}
	}
}
