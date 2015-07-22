package com.hackbulgaria51.week7.addbot;

import java.util.LinkedList;
import java.util.Queue;

public class AdBot {
	private Queue<String> stack;

	public AdBot(String[] array) {
		stack = new LinkedList<>();
		for (String string : array) {
			stack.add(string);
		}
	}

	public void showNextAdd() {
		String message = stack.poll();
		System.out.println(message);
		stack.add(message);
	}
}
