package com.hackbulgaria51.week5.LinkedList;

import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) throws IllegalAccessException {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		int n;
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			l.add(scanner.nextInt());
		}

		l.insert(3, scanner.nextInt());

		l.remove(2);

		l.addFirst(scanner.nextInt());

		int x = scanner.nextInt();

		System.out.println(l.contains(x));
		System.out.println(l.getFirst() + " " + l.getLast());
		System.out.println(l);

	}
}
