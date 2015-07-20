package com.hackbulgaria51.week6.labirinth;

public class Movement {
	protected Player player;

	public Movement(Player player) {
		this.player = player;
	}

	public void moveBack() {
		System.out.println("moving back");
	}

	public void move() {
		System.out.println("Moving right!");
	}
}
