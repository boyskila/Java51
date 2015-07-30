package com.hackbulgaria51.week8.lakes;

import java.util.LinkedList;
import java.util.Queue;

public class Path {
	private Queue<Integer> queue;
	private Queue<Character> instructions;

	public Path(String path) {
		queue = new LinkedList<>();
		instructions = new LinkedList<>();
		for (int i = 0, counter = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'd') {
				counter++;
			} else if (i > 0 && path.charAt(i - 1) == 'u') {
				counter--;
			}
			if (counter <= 0) {
				continue;
			}
			instructions.add(path.charAt(i));
			queue.add(counter);
		}
	}

	public boolean isWalked() {
		return queue.isEmpty();
	}

	public int getDirection() {
		return queue.poll();
	}

	public int getData() {
		char sign = instructions.poll();
		if (sign == 'd' || sign == 'u') {
			return 500;
		}
		return 1000;
	}
}
