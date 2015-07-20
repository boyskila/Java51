package com.hackbulgaria51.week6.landscape;

public class Main {
	public static void main(String[] args) {
		LandScape landscape = new LandScape();
		landscape.addTile(new Land());
		landscape.addTile(new Water());
		landscape.addTile(new Mountain());
		landscape.addTile(new Forest());
		System.out.println(landscape.renderAll()); // --~~/\!!
	}
}
