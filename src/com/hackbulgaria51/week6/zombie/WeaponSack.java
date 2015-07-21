package com.hackbulgaria51.week6.zombie;

public class WeaponSack {
	public static Weapon getWeapon(String weaponName) {
		Weapon weapon;
		switch (weaponName) {
		case "axe":
			weapon = new Axe();
			break;
		case "sword":
			weapon = new AncientSword();
			break;
		case "gun":
			weapon = new Shotgun();
			break;
		case "revolver":
			weapon = new Revolver();
			break;

		default:
			weapon = new Axe();
			break;
		}
		return weapon;
	}
}
