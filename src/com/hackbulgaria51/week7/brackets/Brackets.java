package com.hackbulgaria51.week7.brackets;

import java.util.Stack;

public class Brackets {
	public static boolean isOpenBracket(char a) {
		return a == '(' || a == '{' || a == '[';
	}

	public static boolean get(char bracketForCheck, char closingBracket,
			char openBracket, char c) {
		if (c == closingBracket) {
			return bracketForCheck == openBracket;
		}
		return false;
	}

	public static boolean areCorrect(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char bracket = str.charAt(i);
			if (isOpenBracket(bracket)) {
				stack.push(bracket);
			}
			if (!stack.isEmpty() && !isOpenBracket(bracket)) {
				char bracketForCheck = stack.peek();
				boolean isRoundBracket = get(bracketForCheck, ')', '(', bracket);
				boolean isCurlyBracket = get(bracketForCheck, '}', '{', bracket);
				boolean isSquareBracket = get(bracketForCheck, ']', '[',
						bracket);
				if (isRoundBracket || isCurlyBracket || isSquareBracket) {
					stack.pop();
				} else {
					return false;
				}
			}

		}
		return stack.empty() ;
	}
}
