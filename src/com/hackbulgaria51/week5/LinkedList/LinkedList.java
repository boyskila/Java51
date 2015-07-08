package com.hackbulgaria51.week5.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void addFirst(T data) {
		if (!isEmpty()) {
			Node<T> newNode = new Node<>(data);
			newNode.setNext(head);
			head = newNode;
		} else {
			add(data);
		}
	}

	public T getFirst() {
		return head.getData();
	}

	public T getLast() {
		return tail.getData();
	}

	public int getElementIndex(T data) {
		int counter = 0;
		Node<T> temp = head;
		while (temp.getNext() != null) {
			if (temp.getData() == data) {
				return counter;
			}
			temp = temp.getNext();
			counter++;
		}
		return -1;
	}

	public boolean contains(T data) {
		return getElementIndex(data) != -1;
	}

	public void add(T data) {
		Node<T> element = new Node<>(data);
		if (isEmpty()) {
			head = element;
		} else {
			tail.setNext(element);
		}
		tail = element;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	private Node<T> getNode(int index) {
		int counter = 0;
		Node<T> temp = head;
		while (temp != null) {
			if (counter == index) {
				break;
			}
			temp = temp.getNext();
			counter++;
		}
		return temp;
	}

	public T get(int index) {
		return getNode(index - 1).getData();
	}

	public void set(int index, T el) {
		getNode(index).setData(el);
	}

	public void remove(int index) throws IllegalAccessException {
		if (index > size) {
			throw new IllegalAccessException("LinkedList out of range");
		}
		if (!isEmpty()) {
			if (index > 0 && index < size - 1) {
				Node<T> prevNode1 = getNode(index - 1);
				prevNode1.setNext(prevNode1.getNext().getNext());
			} else if (index == 0) {
				if (head.getNext() != null) {
					head = head.getNext();
				} else {
					head = null;
					tail = null;
				}
			} else {
				Node<T> n = getNode(index - 1);
				n.setNext(null);
				n = tail;
			}
			size--;
		}
	}

	public void insert(int index, T el) throws IllegalAccessException {
		if (index > size) {
			throw new IllegalAccessException("LinkedList out of range");
		}
		Node<T> element = new Node<>(el);
		Node<T> temp = getNode(index - 1);
		element.setNext(temp.getNext());
		temp.setNext(element);
		size++;
	}

	public void removeAll() {
		head = null;
		size = 0;
	}

	@Override
	public String toString() {
		if (!isEmpty()) {
			Node<T> temp = head;
			String str = "[";
			while (temp.getNext() != null) {
				str += temp.getData() + ", ";
				temp = temp.getNext();
			}
			return str + temp.getData() + "]";
		} else {
			return "[]";
		}
	}
}
