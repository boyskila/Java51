package com.hackbulgaria51.week6.zombie;

public class SmashWeapon extends Weapon {

	public SmashWeapon(int damage, int durability) {
		super(damage, durability);
	}

	public int getDamage() {
		durability--;
		if (durability < currentDurability / 2) {
			damage--;
		}
		return damage;
	}

	public String getType() {
		return "TO_SMASH";
	}
}
