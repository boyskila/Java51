package com.hackbulgaria51.week6.zombie;

public abstract class Weapon implements WeaponInterface {
	protected int damage;
	protected int durability;
	protected int currentDurability;

	public Weapon(int damage, int durability) {
		this.damage = damage;
		this.durability = durability;
		this.currentDurability = durability;
	}

	public int getDurability() {
		return durability;
	}

	public abstract int getDamage();

	public abstract String getType();
}
