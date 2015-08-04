package com.hackbulgaria51.week8.chessboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;
	private List<Square> squares = new ArrayList<>();

	public Canvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent((java.awt.Graphics) g);
		Graphics2D g2 = (Graphics2D) g;
		for (int i = 0, a = 0; i < HEIGHT; i += 40, a++) {
			int j = 0;
			if (a % 2 != 0) {
				j = 40;
			}
			for (; j < WIDTH; j += 80) {
				Square square = new Square(j, i);
				g2.setPaint(Color.GRAY);
				squares.add(square);
			}
		}
		for (int j = 0; j < squares.size(); j++) {
			g2.fill(squares.get(j));
		}
	}
}
