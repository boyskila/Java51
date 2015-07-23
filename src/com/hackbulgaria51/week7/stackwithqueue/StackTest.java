package com.hackbulgaria51.week7.stackwithqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Queue<Integer> q = new LinkedList<>();

		for (int i = 10; i < 20; i++) {
			s.push(i);
			q.offer(i);
		}
		System.out.println("Stack head ==> "+s.peek());
				System.out.print("Stack after poping ==> ");
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
		System.out.println();
		System.out.print("Queue after poping ==> ");
		while (!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
	}
}
