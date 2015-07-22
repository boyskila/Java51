package com.hackbulgaria51.week7.brackets;

import java.util.Scanner;

public class BracketsTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String brackets = scanner.next();
		System.out.println(Brackets.areCorrect(brackets));
	}
}
