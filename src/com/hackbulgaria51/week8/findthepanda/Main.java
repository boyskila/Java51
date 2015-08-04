package com.hackbulgaria51.week8.findthepanda;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int row = Integer.parseInt(sc.nextLine());
		int col = Integer.parseInt(sc.nextLine());
		Labirinth l = new Labirinth();
		for (int i = 0; i < col; i++) {
			l.createLabirinth(sc.nextLine());
		}
		 l.linkNodes();
		System.out.println(l.toString());
	}

}
