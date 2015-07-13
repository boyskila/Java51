package com.hackbulgaria51.week6.zombieapocalypses;

import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zombieCount = sc.nextInt();
		int zombieHealth = sc.nextInt();
		String weaponName = sc.next();
		Weapon[] weapons = { new Axe(), new AncientSword(), new Shotgun(),
				new Revolver() };
		Weapon weapon = null;
		for (Weapon w : weapons) {
			if (w.getName().equals(weaponName)) {
				weapon = w;
			}
		}
		int counter = 0;
		for (int i = 0; i < zombieCount; i++) {
			Zombie zombie = new AllienZombie(zombieHealth);
			while (!zombie.isDead()) {
				zombie.hit(weapon.getDamage());
				counter++;
			}
		}
		System.out.println(counter);
	}
}
