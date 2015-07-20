package com.hackbulgaria51.week6.labirinth;

import java.util.Scanner;

public class Labirinth {
	private char[][] labirinth;
	private Player player;
	private static final char SIGN = 'x';

	public Labirinth(char[][] labirinth) {
		player = new Player(1, 1);
		this.labirinth = labirinth;
	}

	public void printLabirinth() {
		for (int i = 0; i < labirinth.length; i++) {
			for (int j = 0; j < labirinth[i].length; j++) {
				char ch = i == player.x && j == player.y ? SIGN
						: labirinth[i][j];
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public void message(int health) {
		String winnerMessage = "Congratulations! You have escaped the labirinth.\nHere are some aliens: (-(-(-_-)-)-)";
		String loserMessage = "Not enough power to finish the labirinth";
		String finalMessage = health > 0 ? winnerMessage : loserMessage;
		System.out.println(finalMessage);
	}

	public boolean canMove() {
		return labirinth[player.x][player.y] == '#';
	}

	public boolean isExit() {
		return labirinth[player.x][player.y] == '!';
	}

	public void findExit(Scanner sc) {
		Movement kindOfMove = null;
		int health = 1;
		while (!isExit() && health > 0) {
			printLabirinth();
			System.out.println("Make your move:");
			switch (sc.next()) {
			case "r":
				kindOfMove = new MoveRight(player);
				break;
			case "l":
				kindOfMove = new MoveLeft(player);
				break;
			case "d":
				kindOfMove = new MoveDown(player);
				break;
			case "u":
				kindOfMove = new MoveUp(player);
				break;
			case "j":
				kindOfMove = new Jump(player);
				break;
			default:
				System.out.println("Invalid direction!Try again");
				continue;
			}
			kindOfMove.move();
			health = player.decreaseHealth();
			System.out.println("Power " + health);
			if (canMove()) {
				System.out.println("Select another direction");
				kindOfMove.moveBack();
			}
		}
		printLabirinth();
		message(health);
	}
}
