package com.hackbulgaria51.week8.squaresinthecorner;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	public static int WIDTH = 600;
	public static int HEIGHT = 600;
	public static int SQUARE_WIDTH = 300;

	public void paintComponent(Graphics g) {
		super.paintComponent((java.awt.Graphics) g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle upLeftSquare = new Rectangle(0, 0, SQUARE_WIDTH, SQUARE_WIDTH);
		Rectangle upRightSquare = new Rectangle(SQUARE_WIDTH, 0, SQUARE_WIDTH,
				SQUARE_WIDTH);
		Rectangle lowLeftSquare = new Rectangle(0, SQUARE_WIDTH, SQUARE_WIDTH,
				SQUARE_WIDTH);
		Rectangle lowRightSquare = new Rectangle(SQUARE_WIDTH, SQUARE_WIDTH,
				SQUARE_WIDTH, SQUARE_WIDTH);
		g2.setPaint(Color.GREEN);
		g2.fill(upLeftSquare);
		g2.setPaint(Color.RED);
		g2.fill(upRightSquare);
		g2.setPaint(Color.YELLOW);
		g2.fill(lowLeftSquare);
		g2.setPaint(Color.BLUE);
		g2.fill(lowRightSquare);
	}

	public Canvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}
