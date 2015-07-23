package com.hackbulgaria51.week7.priorityqueue;

import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue implements PriorityQueueInterface {
	private Queue<Integer> l;

	PriorityQueue() {
		l = new java.util.PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
	}

	@Override
	public int pop() {
		return l.poll();
	}

	@Override
	public int peek() {
		return l.peek();
	}

	@Override
	public boolean isEmpty() {
		return l.isEmpty();
	}

	@Override
	public void push(int data) {
		l.offer(data);
	}
}
