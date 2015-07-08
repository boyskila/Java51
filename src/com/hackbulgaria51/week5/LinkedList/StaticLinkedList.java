package com.hackbulgaria51.week5.LinkedList;

public class StaticLinkedList {
	public static LinkedList<Integer> reverse(LinkedList<Integer> l)
			throws IllegalAccessException {
		LinkedList<Integer> result = new LinkedList<Integer>();
		for (int i = l.size(); i > 0; i--) {
			result.add(l.get(i));
		}
		return result;
	}

	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		// Sorts the list
		return null;
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		for (int i = 0; i < b.size(); i++) {
			a.add(b.get(i));
		}
		return a;
	}
}
