package com.hackbulgaria51.week6.labirinth;

public class MoveLeft extends Movement {
	public MoveLeft(Player coordinates) {
		super(coordinates);
	}

	public void move() {
		System.out.println("left");
		player.y--;
	}

	public void moveBack() {
		player.y++;
	}
}
