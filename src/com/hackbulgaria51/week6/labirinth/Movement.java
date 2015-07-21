package com.hackbulgaria51.week6.labirinth;

public abstract class Movement {
	protected Player player;

	public Movement(Player player) {
		this.player = player;
	}

	public abstract void moveBack();

	public abstract void move();
}
