package com.hackbulgaria51.week6.labirinth;

public class Player {
	public int x;
	public int y;
	public int health;

	Player(int x, int y) {
		this.x = x;
		this.y = y;
		health = 20;
	}

	public int decreaseHealth() {
		if (health >= 0) {
			health -= 2;
		}
		return health;
	}
}
