package com.hackbulgaria51.week8.chessboard;

import java.awt.Rectangle;

public class Square extends Rectangle {
	private static final int WIDTH = 40;
	private static final int HEIGHT = 40;

	Square(int x, int y) {
		
		setBounds(x, y, WIDTH, HEIGHT);
	}
}
