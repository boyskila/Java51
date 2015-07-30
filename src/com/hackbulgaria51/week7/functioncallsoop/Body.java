package com.hackbulgaria51.week7.functioncallsoop;
import java.util.LinkedList;
import java.util.Queue;

public class Body {
	private String[] splitedBody;
	private Queue<String> queue;

	public Body(String expression, int argument) {
		queue = new LinkedList<>();
		splitedBody = expression.replaceAll("x", argument + "").split(" ");
		for (int i = 3; i < splitedBody.length; i++) {
			queue.add(splitedBody[i]);
		}
	}

	public String[] getBody() {
		return splitedBody;
	}

	public String getBodyPart() {
		return queue.poll();
	}

	public boolean isCalculated() {
		return queue.isEmpty();
	}
}
