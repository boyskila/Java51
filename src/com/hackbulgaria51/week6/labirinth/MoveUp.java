package com.hackbulgaria51.week6.labirinth;

public class MoveUp extends Movement {
	public MoveUp(Player pair) {
		super(pair);
	}

	public void move() {
		System.out.println("up");
		player.x--;
	}

	public void moveBack() {
		player.x++;
	}
}
