package com.hackbulgaria51.week6.landscape;

import java.util.Vector;

public class LandScape {
	Vector<Tile> tile;

	public LandScape() {
		tile = new Vector<Tile>();
	}

	public void addTile(Tile t) {
		tile.add(t);
	}

	public String renderAll() {
		String str = "";
		for (Tile tile2 : tile) {
			str += tile2.render();
		}
		return str;
	}
}
