package com.hackbulgaria51.week6.zombie;

public interface Zombie {
	public int getTotalHealth();

	public int getCurrentHealth();

	public void hit(int damage);

	public boolean isDead();
}
