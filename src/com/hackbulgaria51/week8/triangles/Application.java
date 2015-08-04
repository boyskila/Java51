package com.hackbulgaria51.week8.triangles;

import javax.swing.JFrame;

public class Application extends JFrame{
	public Application() {
		add(new Canvas());
		setResizable(false);
		setTitle("My application name");
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
	}
}
