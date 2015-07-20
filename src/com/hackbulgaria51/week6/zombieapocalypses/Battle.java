package com.hackbulgaria51.week6.zombieapocalypses;

import java.util.Scanner;

public class Battle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zombieCount = sc.nextInt();
		int zombieHealth = sc.nextInt();
		Weapon weapon = new WeaponSack().getWeapon(sc.next());
		int counter = 0;
		for (int i = 0; i < zombieCount; i++) {
			Zombie zombie = new AllienZombie(zombieHealth);
			while (!zombie.isDead()) {
				zombie.hit(weapon.getDamage());
				counter++;
			}
		}
		System.out.printf("The allienZombie was killed after %d hits with %s",
				counter, weapon.getName());
		sc.close();
	}
}
