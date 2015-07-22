package com.hackbulgaria51.week7.queue;

public class Queue<T> implements List<T> {
	public Node<T> head;
	public Node<T> tail;

	private class Node<T> {
		public T data;
		public Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	public Queue() {
		head = null;
		tail = null;
	}

	@Override
	public void push(T data) {
		Node<T> node = new Node<>(data);
		if (empty()) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = tail.next;

		}

	}

	@Override
	public void pop() {
		head = head.next;

	}

	@Override
	public int size() {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	@Override
	public T peek() {
		if (empty()) {
			return null;
		}
		return head.data;
	}

	@Override
	public boolean empty() {
		return head == null;
	}
	public String toString(){
		String str = "[";
		Node<T> temp = head;
		while(temp.next != null){
			str += temp.data + ",";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}

}
