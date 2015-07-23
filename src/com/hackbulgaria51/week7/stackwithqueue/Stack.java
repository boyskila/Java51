package com.hackbulgaria51.week7.stackwithqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<T> {
	private Queue<T> firstQueue;
	private Queue<T> secondQueue;

	public Stack() {
		firstQueue = new LinkedList<>();
		secondQueue = new LinkedList<>();
	}

	public T pop() {
		int size = firstQueue.size() - 1;
		for (int i = 0; i <= size; i++) {
			if (i == size) {
				T d = firstQueue.poll();
				firstQueue = secondQueue;
				return d;
			}
			secondQueue.offer(firstQueue.poll());
		}
		return null;
	}

	public T peek() {
		int size = firstQueue.size() - 1;
		for (int i = 0; i <= size; i++) {
			if (i == size) {
				return firstQueue.peek();
			}
			secondQueue.offer(firstQueue.poll());
		}
		firstQueue = secondQueue;
		return null;
	}

	public boolean isEmpty() {
		return firstQueue.isEmpty();
	}

	public void push(T data) {
		firstQueue.offer(data);
	}

}
