package com.hackbulgaria51.week6.zombie;

import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zombieCount = sc.nextInt();
		int zombieHealth = sc.nextInt();
		String weaponName = sc.next();
		Weapon weapon = WeaponSack.getWeapon(weaponName);
		int counter = 0;
		for (int i = 0; i < zombieCount; i++) {
			Zombie zombie = new AllienZombie(zombieHealth);
			while (!zombie.isDead()) {
				zombie.hit(weapon.getDamage());
				counter++;
			}
		}
		System.out.println(counter);
		sc.close();
	}
}
