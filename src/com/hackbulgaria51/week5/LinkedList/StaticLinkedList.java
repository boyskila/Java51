package com.hackbulgaria51.week5.LinkedList;

import java.util.Collections;
import java.util.Vector;

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
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < l.size(); i++) {
			v.add(l.get(i));
		}
		Collections.sort(v);
		return new LinkedList<Integer>(v);
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		for (int i = 0; i < b.size(); i++) {
			a.add(b.get(i));
		}
		return a;
	}
}
