package com.hackbulgaria51.week6.zombieapocalypses;

public class Axe implements Weapon {
	private int damage;
	private int durability;
	private int maxDurability;
	public final static String NAME = "axe";

	public Axe() {
		damage = 10;
		durability = 50;
		maxDurability = 50;
	}

	@Override
	public int getDamage() {
		durability -= 1;
		if (durability < maxDurability / 2) {
			damage -= 1;
		}
		return damage;
	}

	@Override
	public int getDurability() {
		return durability;
	}

	@Override
	public String getType() {
		return "TO_SMASH";
	}

	@Override
	public String getName() {
		return NAME;
	}
}
