package com.hackbulgaria51.week7.queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		for (int i = 10; i < 20; i++) {
			q.push(i);
		}
		System.out.println(q);
		while(!q.empty()){
			System.out.print(q.peek());
			q.pop();
		}
	}
}
