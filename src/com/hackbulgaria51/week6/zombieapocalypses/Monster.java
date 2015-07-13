package com.hackbulgaria51.week6.zombieapocalypses;

public class Monster implements Zombie {
	private int health;
	private int currentHealth;

	public Monster(int health) {
		this.health = health;
		currentHealth = health;
	}

	@Override
	public int getTotalHealth() {
		return health;
	}

	@Override
	public int getCurrentHealth() {
		return currentHealth;
	}

	@Override
	public void hit(int damage) {
		if (currentHealth > 0) {
			currentHealth -= damage;
		}
	}

	@Override
	public boolean isDead() {
		return getCurrentHealth() == 0;
	}
}
