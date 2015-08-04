package com.hackbulgaria51.week8.triangles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Canvas extends JPanel implements MouseListener {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 700;


  public Canvas() {
    // very important here - addMouseListener(this)
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    addMouseListener(this);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    // magic happens here  
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    // magic happens here 

    // calling repaint is important 
    repaint();
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}