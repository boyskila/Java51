package com.hackbulgaria51.week6.zombieapocalypses;

public class Shotgun implements Weapon {
	private int damage;
	private int durability;
	public final static String NAME = "shotgun";

	public Shotgun() {
		damage = 25;
		durability = 10;
	}

	@Override
	public int getDamage() {
		durability -= 1;
		if (durability == 0) {
			damage = 1;
		}
		return damage;
	}

	@Override
	public int getDurability() {
		return durability;
	}

	@Override
	public String getType() {
		return "TO_SHOOT";
	}

	@Override
	public String getName() {
		return NAME;
	}
}
