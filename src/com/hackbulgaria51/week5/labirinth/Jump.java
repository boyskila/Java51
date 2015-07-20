package com.hackbulgaria51.week5.labirinth;

public class Jump extends Movement {

	public Jump(Player player) {
		super(player);
	}
	public void move(){
		player.decreaseHealth();
		player.y+=2;
		
	}
	public void moveBack(){
		player.y--;
	}

}
