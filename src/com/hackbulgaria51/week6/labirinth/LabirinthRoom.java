package com.hackbulgaria51.week6.labirinth;

import java.util.Scanner;

public class LabirinthRoom {
	public static void main(String[] args) {
		char[][] labirinth = { { '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', '.', '.', '.', '#', '.', '.', '#' },
				{ '#', '.', '#', '.', '.', '#', '.', '#' },
				{ '#', '.', '.', '#', '.', '#', '.', '#' },
				{ '#', '#', '.', '#', '.', '.', '.', '#' },
				{ '#', '.', '.', '.', '.', '#', '.', '#' },
				{ '#', '#', '#', '#', '#', '#', '!', '#' } };
		Scanner sc = new Scanner(System.in);
		new Labirinth(labirinth).findExit(sc);
		sc.close();
	}
}
