package com.hackbulgaria51.week6.zombie;

public class ShootWeapon extends Weapon {

	public ShootWeapon(int damage, int durability) {
		super(damage, durability);
	}

	public int getDamage() {
		if (getDurability() > 0) {
			durability--;
		}
		if (durability == 0) {
			damage = 1;
		}
		return damage;
	}

	public String getType() {
		return "TO_SHOOT";
	}
}
