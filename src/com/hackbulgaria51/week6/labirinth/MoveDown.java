package com.hackbulgaria51.week6.labirinth;

public class MoveDown extends Movement {
	public MoveDown(Player coordinates) {
		super(coordinates);
	}

	public void move() {
		System.out.println("down");
		player.x++;
	}
	public void moveBack() {
		player.x--;
	}
}
