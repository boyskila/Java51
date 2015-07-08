package com.hackbulgaria51.week5.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) throws IllegalAccessException {
		LinkedList<Integer> l = new LinkedList<>();
		for (int i = 10; i < 20; i++) {
			l.add(i);
		}
		System.out.println(l);
		System.out.println("Size of the LinkedList " + l.size());
		l.insert(2, 5);
		System.out.println("insert 5 at index 2 " + l);
		System.out.println("Size of the LinkedList " + l.size());
		l.remove(1);
		System.out.println("Remove element at index 1 " + l);
		l.remove(l.size() - 1);
		System.out.println("Remove last element " + l);
		l.remove(0);
		System.out.println("Remove first element " + l);
		l.removeAll();
		System.out.println("Delete LinkedList");
		System.out.println("After removeAll() size of the LinkedList is "
				+ l.size());
		l.add(1000000);
		l.add(111);
		System.out.println("Added again some numbers" + l);
	}
}
