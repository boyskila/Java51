package com.hackbulgaria51.week8.treelevel;

public class Node<T> {
	public T data;
	public Node<T> left;
	public Node<T> right;
	
	public Node(T data) {
		this.data = data;
		left = null;
		right = null;
	}
}
