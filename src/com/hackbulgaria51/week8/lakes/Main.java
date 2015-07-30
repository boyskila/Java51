package com.hackbulgaria51.week8.lakes;

import java.util.Scanner;

public class Main {
	public static int calculateLakeVolume() {
		Scanner sc = new Scanner(System.in);
		String borders = sc.nextLine();
		Path path = new Path(borders);
		Lake<Node> lake = new Lake<>();
		while (!path.isWalked()) {
			int depth = path.getDirection();
			int data = path.getData();
			Node node = new Node(data, depth);
			lake.fillTheLake(node);
		}
		sc.close();
		return lake.getVolume();
	}

	public static void main(String[] args) {
		System.out.println(calculateLakeVolume());
	}
}
