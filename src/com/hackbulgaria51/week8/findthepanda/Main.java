package com.hackbulgaria51.week8.findthepanda;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		int col = Integer.parseInt(sc.nextLine());
		String[][] lab = new String[row][];
		for (int i = 0; i < row; i++) {
			String[] labs = sc.nextLine().split("");
			lab[i] = labs;
		}
		Labirinth l = new Labirinth(lab, row, col);
		l.makeLinks();
		System.out.println(l.canFind());
		sc.close();
	}

}
