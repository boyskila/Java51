package com.hackbulgaria51.week7.queue;

public interface List<T> {

	public void push(T data);

	public void pop();

	public int size();

	public T peek();

	public boolean empty();

}
