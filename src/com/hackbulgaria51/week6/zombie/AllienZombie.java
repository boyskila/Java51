package com.hackbulgaria51.week6.zombie;

public class AllienZombie implements Zombie {
	private int health;
	private int currentHealth;

	public AllienZombie(int health) {
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
		currentHealth -= damage;
	}

	@Override
	public boolean isDead() {
		return getCurrentHealth() <= 0;
	}
}
