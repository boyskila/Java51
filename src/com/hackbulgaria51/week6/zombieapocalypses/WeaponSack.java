package com.hackbulgaria51.week6.zombieapocalypses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeaponSack implements Iterable<Weapon> {
	private List<Weapon> weapons;

	public WeaponSack() {
		weapons = new ArrayList<Weapon>();
		weapons.add(new Axe());
		weapons.add(new AncientSword());
		weapons.add(new Shotgun());
		weapons.add(new Revolver());
	}

	public Weapon getWeapon(String weaponName) {
		for (Weapon weapon : weapons) {
			if (weapon.getName().equals(weaponName)) {
				return weapon;
			}
		}
		return new Axe();
	}

	@Override
	public Iterator<Weapon> iterator() {
		Iterator<Weapon> it = weapons.iterator();
		return it;
	}
}
