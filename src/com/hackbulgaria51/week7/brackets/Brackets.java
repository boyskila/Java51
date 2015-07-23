package com.hackbulgaria51.week7.brackets;

import java.util.Stack;

public class Brackets {
	public static boolean isOpenBracket(char a) {
		return a == '(' || a == '{' || a == '[';
	}

	public static boolean isPairOfBrackets(char openBracket, char closingBracket) {
		return openBracket == '(' && closingBracket == ')'
				|| openBracket == '{' && closingBracket == '}'
				|| openBracket == '[' && closingBracket == ']';
	}

	public static boolean areStacksEmpty(Stack<Character> s1,
			Stack<Character> s2) {
		return s1.isEmpty() || s2.isEmpty();
	}

	public static boolean areCorrect(String str) {
		Stack<Character> openBracketsStack = new Stack<>();
		Stack<Character> closingBracketsStack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char bracket = str.charAt(i);
			if (isOpenBracket(bracket)) {
				openBracketsStack.push(bracket);
			} else {
				closingBracketsStack.push(bracket);
				if (!areStacksEmpty(openBracketsStack, closingBracketsStack)
						&& !isPairOfBrackets(openBracketsStack.pop(),
								closingBracketsStack.pop())) {
					return false;
				}
			}
		}
		return openBracketsStack.isEmpty() && closingBracketsStack.isEmpty();
	}
}
