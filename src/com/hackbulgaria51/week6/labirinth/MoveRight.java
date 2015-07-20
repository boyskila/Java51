package com.hackbulgaria51.week6.labirinth;

public class MoveRight extends Movement {

	public MoveRight(Player player) {
		super(player);
	}

	public void move() {
		System.out.println("right");
		player.y++;
	}

	public void moveBack() {
		player.y--;
	}
}
